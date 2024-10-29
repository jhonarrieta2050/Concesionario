/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.utilidades;

/**
 *
 * @author Alexander Samuel
 */
import javax.swing.JOptionPane;
class controladorLogin {
    
    public void procesarLogin(String usuario, String contraseña){
    if(usuario.isEmpty() || contraseña.isEmpty()){
    JOptionPane.showMessageDialog(null, "Porfavor, llene todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    }
}
