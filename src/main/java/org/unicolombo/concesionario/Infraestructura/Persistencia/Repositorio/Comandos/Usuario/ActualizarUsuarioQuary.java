package org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Comandos.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Datos.ObtenerConexion;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Comandos.Usuario.IactualizarUsuarioQuary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ActualizarUsuarioQuary implements IactualizarUsuarioQuary {
    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        String queryActualizarUsuario = "UPDATE usuarios SET nombre = ?, apellido = ?, correo = ?, contrasena = ?, cartera = ? WHERE id_usuarios = ?";
        String queryObtenerUsuario = "SELECT id_usuarios, nombre, apellido, correo, contrasena, cartera FROM usuarios WHERE id_usuarios = ?";

        Usuario usuarioActualizado = null;

        try (Connection cx = ObtenerConexion.connection()) {
            cx.setAutoCommit(false);

            try (PreparedStatement stmtActualizar = cx.prepareStatement(queryActualizarUsuario);
                 PreparedStatement stmtObtener = cx.prepareStatement(queryObtenerUsuario)) {

                stmtActualizar.setString(1, usuario.getNombre());
                stmtActualizar.setString(2, usuario.getApellido());
                stmtActualizar.setString(3, usuario.getCorreo());
                stmtActualizar.setString(4, usuario.getContrasena());
                stmtActualizar.setDouble(5, usuario.getCartera());
                stmtActualizar.setInt(6, usuario.getIdUsuario());

                int filasActualizadas = stmtActualizar.executeUpdate();

                if (filasActualizadas > 0) {

                    stmtObtener.setInt(1, usuario.getIdUsuario());
                    try (ResultSet rs = stmtObtener.executeQuery()) {
                        if (rs.next()) {
                            usuarioActualizado = new Usuario();
                            usuarioActualizado.setIdUsuario(rs.getInt("id_usuarios"));
                            usuarioActualizado.setNombre(rs.getString("nombre"));
                            usuarioActualizado.setApellido(rs.getString("apellido"));
                            usuarioActualizado.setCorreo(rs.getString("correo"));
                            usuarioActualizado.setContrasena(rs.getString("contrasena"));
                            usuarioActualizado.setCartera(rs.getDouble("cartera"));
                        }
                    }
                }

                cx.commit();

            } catch (SQLException e) {
                cx.rollback();
                throw e;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarioActualizado;
    }
}
