/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto.ComandoUsuarioRepositorioImp;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Comandos.ComandosBasicosInterface;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.CrearUsuarioComand;
import org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario.IcrearUsuarioHandlerComand;

/**
 *
 * @author Usuario
 */
public class UsuarioHandlerComand implements IcrearUsuarioHandlerComand {
    
    private ComandosBasicosInterface comandRepositoryInterface = new ComandoUsuarioRepositorioImp();

    @Override
    public void guardarUsuario(CrearUsuarioComand usuarioComand){
        Usuario usuario = new Usuario(usuarioComand.getNombre(), usuarioComand.getApellido(), usuarioComand.getCorreo(), usuarioComand.getContrasena());
        comandRepositoryInterface.guardar(usuario);
    }
}
