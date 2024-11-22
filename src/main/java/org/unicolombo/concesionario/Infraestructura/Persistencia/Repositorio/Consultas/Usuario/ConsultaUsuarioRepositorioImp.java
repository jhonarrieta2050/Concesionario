package org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Consultas.Usuario;

import org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Comandos.Usuario.ComandoUsuarioRepositorioImp;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.ConsultasBasicasInterfaces;
import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Datos.ObtenerConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaUsuarioRepositorioImp implements ConsultasBasicasInterfaces<Usuario> {
    @Override
    public Optional<Usuario> buscarObjeto(Usuario o) {

        Usuario usuarioEncontrado = new Usuario();

        if(o.getContrasena().isEmpty() || o.getCorreo().isEmpty()){
            System.out.println("estan vacios");
        }else{
            System.out.println(o.getContrasena());
            System.out.println(o.getCorreo());
        }

        try(Connection cx = ObtenerConexion.connection();
            PreparedStatement stmt = cx.prepareStatement("SELECT * FROM usuarios WHERE correo = ? AND contrasena = ? ")){

            stmt.setString(1, o.getCorreo());
            stmt.setString(2, o.getContrasena());

            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()) {
                    usuarioEncontrado.setIdUsuario(rs.getInt("id_usuarios"));
                    usuarioEncontrado.setNombre(rs.getString("nombre"));
                    usuarioEncontrado.setApellido(rs.getString("apellido"));
                    usuarioEncontrado.setCorreo(rs.getString("correo"));
                    usuarioEncontrado.setContrasena(rs.getString("contrasena"));
                    usuarioEncontrado.setCartera(rs.getDouble("cartera"));

                    System.out.println(usuarioEncontrado.toString());
                }else{
                    System.out.println("No se a encontrado");
                    return Optional.empty();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ComandoUsuarioRepositorioImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Optional.ofNullable(usuarioEncontrado);
    }

    @Override
    public void objetoId(int id) {

    }
}
