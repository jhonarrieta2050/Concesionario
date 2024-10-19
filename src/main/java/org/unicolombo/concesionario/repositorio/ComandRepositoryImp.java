/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.unicolombo.concesionario.clases.usuario.Usuario;
import org.unicolombo.concesionario.repositorio.interfaces.ComandRepositoryInterface;

/**
 *
 * @author Usuario
 */
public class ComandRepositoryImp implements ComandRepositoryInterface<Usuario> {

    @Override
    public void guardar(Usuario o) {
        
        try(Connection cx = ObtenerConexion.connection();
            PreparedStatement stmt = cx.prepareStatement("INSERT INTO usuarios (nombre, apellido, correo, contrasena) VALUES (?, ?, ?, ?) ")){
            
            stmt.setString(1, o.getNombre());
            stmt.setString(2, o.getApellido());
            stmt.setString(3, o.getCorreo());
            stmt.setString(4, o.getContrasena());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ComandRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario buscarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
