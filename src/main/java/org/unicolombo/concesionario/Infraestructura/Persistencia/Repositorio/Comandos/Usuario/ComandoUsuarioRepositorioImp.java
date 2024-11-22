/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Comandos.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Comandos.ComandosBasicosInterface;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Datos.ObtenerConexion;

/**
 *
 * @author Usuario
 */
public class ComandoUsuarioRepositorioImp implements ComandosBasicosInterface<Usuario> {

    @Override
    public void guardar(Usuario o) {
        
        try(Connection cx = ObtenerConexion.connection();
            PreparedStatement stmt = cx.prepareStatement("INSERT INTO usuarios (nombre, apellido, correo, contrasena,cartera) VALUES (?, ?, ?, ?,0.0) ")){
            
            stmt.setString(1, o.getNombre());
            stmt.setString(2, o.getApellido());
            stmt.setString(3, o.getCorreo());
            stmt.setString(4, o.getContrasena());
            
            stmt.execute();
            System.out.println("si llego");
        } catch (SQLException ex) {
            Logger.getLogger(ComandoUsuarioRepositorioImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hubo un error");
        }
    }

    @Override
    public void editar(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
