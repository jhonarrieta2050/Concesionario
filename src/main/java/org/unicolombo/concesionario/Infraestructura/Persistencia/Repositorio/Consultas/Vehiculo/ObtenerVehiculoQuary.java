package org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Consultas.Vehiculo;

import org.unicolombo.concesionario.Dominio.Modelos.Automoviles;
import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Datos.ObtenerConexion;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Comandos.Usuario.ComandoUsuarioRepositorioImp;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.Vehiculo.IobtenerVehiculoConsulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObtenerVehiculoQuary implements IobtenerVehiculoConsulta {

    @Override
    public HashSet<Vehiculos> obtenerVehiculos() {

        HashSet<Vehiculos> vehiculos = new HashSet<>();

        try (Connection cx = ObtenerConexion.connection();
             PreparedStatement stmt = cx.prepareStatement(
                     "SELECT vehiculos.*, vendedor.nombre AS nombre_vendedor, vendedor.apellido AS apellidos_vendedor " +
                             "FROM vehiculos " +
                             "JOIN catalogo_vehiculos ON vehiculos.id_vehiculos = catalogo_vehiculos.id_vehiculo " +
                             "JOIN vendedor ON catalogo_vehiculos.id_vendedor = vendedor.id_vendedor " +
                             "WHERE vehiculos.tipo_vehiculo = 'carro'"
             )) {

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    Vehiculos vehiculo = new Automoviles();

                    vehiculo.setMarca(rs.getString("marca"));
                    vehiculo.setModelo(rs.getString("modelo"));
                    vehiculo.setPlaca(rs.getString("placa"));
                    vehiculo.setCilindrado(rs.getString("cilindrado"));
                    vehiculo.setPrecio(rs.getDouble("precio"));
                    vehiculo.setDistribuidor(rs.getString("nombre_vendedor"));

                    vehiculos.add(vehiculo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehiculos;
    }
}
