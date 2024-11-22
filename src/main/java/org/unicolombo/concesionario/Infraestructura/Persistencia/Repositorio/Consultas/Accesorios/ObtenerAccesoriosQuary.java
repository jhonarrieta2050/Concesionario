package org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Consultas.Accesorios;

import org.unicolombo.concesionario.Dominio.Modelos.Accesorios;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Datos.ObtenerConexion;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.Accesorios.IobtenerAccesoriosQuary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ObtenerAccesoriosQuary implements IobtenerAccesoriosQuary {
    @Override
    public ArrayList<Accesorios> obtenerAccesorios() {
        ArrayList<Accesorios> accesoriosCatalogo = new ArrayList<>();

        try (Connection cx = ObtenerConexion.connection();
             PreparedStatement stmt = cx.prepareStatement(
                     "SELECT accesorios.nombre, accesorios.descripcion, accesorios.tipo_vehiculo, accesorios.precio " +
                             "FROM catalogo_accesorios " +
                             "JOIN accesorios ON catalogo_accesorios.id_accesorio = accesorios.id_accesorios " +
                             "WHERE accesorios.tipo_vehiculo = 'carro'"
             )) {

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    Accesorios accesorio = new Accesorios();

                    accesorio.setNombre(rs.getString("nombre"));
                    accesorio.setDescripcion(rs.getString("descripcion"));
                    accesorio.setTipoVehiculo(rs.getString("tipo_vehiculo"));
                    accesorio.setPrecio(rs.getDouble("precio"));

                    accesoriosCatalogo.add(accesorio);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accesoriosCatalogo;
    }
}
