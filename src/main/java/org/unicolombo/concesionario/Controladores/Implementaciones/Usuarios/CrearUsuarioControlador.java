package org.unicolombo.concesionario.Controladores.Implementaciones.Usuarios;

import org.unicolombo.concesionario.Controladores.Interfaces.Usuarios.IcrearUsuarioControlador;
import org.unicolombo.concesionario.negocio.CasosUso.Usuario.CrearUsuarioService;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.CrearUsuarioComand;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IcrearUsuarioService;

public class CrearUsuarioControlador implements IcrearUsuarioControlador {

    private IcrearUsuarioService usuarioService;

    public CrearUsuarioControlador() {
        this.usuarioService = new CrearUsuarioService();
    }

    @Override
    public void executar(String correo, String contrasena, String apellido, String nombre) {
        CrearUsuarioComand usuario = new CrearUsuarioComand(correo,contrasena,apellido,nombre);
        usuarioService.crearUsuario(usuario);
    }
}
