package org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Comandos.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Datos.ObtenerConexion;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Comandos.Usuario.IrecargarUsuarioQuary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecargarUsuarioQuary implements IrecargarUsuarioQuary {
    @Override
    public Usuario recargarUsuario(Usuario usuario) {
        Usuario usuarioActualizado = null;

        String queryActualizarSaldo = "UPDATE usuarios SET cartera = cartera + ? WHERE id_usuarios = ?";
        String queryObtenerUsuario = "SELECT id_usuarios,apellido, nombre, correo, cartera, apellido,contrasena FROM usuarios WHERE id_usuarios = ?";

        try (Connection cx = ObtenerConexion.connection()) {

            cx.setAutoCommit(false);

            try (PreparedStatement stmtActualizar = cx.prepareStatement(queryActualizarSaldo);
                 PreparedStatement stmtObtener = cx.prepareStatement(queryObtenerUsuario)) {


                stmtActualizar.setDouble(1, usuario.getCartera());
                stmtActualizar.setInt(2, usuario.getIdUsuario());
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
            return usuarioActualizado;
        }
        return usuarioActualizado;
    }
}