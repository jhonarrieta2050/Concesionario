/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.clases.usuario.comandos;

import org.unicolombo.concesionario.clases.usuario.modelo.Usuario;
import org.unicolombo.concesionario.clases.usuario.repositorios.ComandoUsuarioRepositorioImp;
import org.unicolombo.concesionario.clases.interfaces.ComandRepositoryInterface;

/**
 *
 * @author Usuario
 */
public class UsuarioHandlerComand {
    
    private ComandRepositoryInterface comandRepositoryInterface = new ComandoUsuarioRepositorioImp();
    
    public void guardarUsuario(Usuario usuario){
        comandRepositoryInterface.guardar(usuario);
    }
}
