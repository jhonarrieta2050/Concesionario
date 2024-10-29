package org.unicolombo.concesionario.clases.usuario.repositorios;

import org.unicolombo.concesionario.clases.interfaces.QuaryRepositoryInterface;
import org.unicolombo.concesionario.clases.usuario.modelo.Usuario;
import org.unicolombo.concesionario.utilidades.ObtenerConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaUsuarioRepositorioImp implements QuaryRepositoryInterface<Usuario> {
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
                    usuarioEncontrado.setIdUsuario(rs.getInt("id_usuario"));
                    usuarioEncontrado.setNombre(rs.getString("nombre"));
                    usuarioEncontrado.setApellido(rs.getString("apellido"));
                    usuarioEncontrado.setCorreo(rs.getString("correo"));
                    usuarioEncontrado.setContrasena(rs.getString("contrasena"));
                    usuarioEncontrado.setCartera(rs.getDouble("saldo"));

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
