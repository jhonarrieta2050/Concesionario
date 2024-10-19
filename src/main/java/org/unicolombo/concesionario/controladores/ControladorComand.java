/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.controladores;

import org.unicolombo.concesionario.clases.usuario.Usuario;
import org.unicolombo.concesionario.repositorio.ComandRepositoryImp;
import org.unicolombo.concesionario.repositorio.interfaces.ComandRepositoryInterface;

/**
 *
 * @author Usuario
 */
public class ControladorComand {
    
    private ComandRepositoryInterface comandRepositoryInterface = new ComandRepositoryImp();
    
    public void guardarUsuario(Usuario usuario){
        comandRepositoryInterface.guardar(usuario);
    }
}
