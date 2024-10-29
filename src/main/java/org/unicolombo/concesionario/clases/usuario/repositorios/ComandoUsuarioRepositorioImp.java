/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.clases.usuario.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.unicolombo.concesionario.clases.usuario.modelo.Usuario;
import org.unicolombo.concesionario.clases.interfaces.ComandRepositoryInterface;
import org.unicolombo.concesionario.utilidades.ObtenerConexion;

/**
 *
 * @author Usuario
 */
public class ComandoUsuarioRepositorioImp implements ComandRepositoryInterface<Usuario> {

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
            Logger.getLogger(ComandoUsuarioRepositorioImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
