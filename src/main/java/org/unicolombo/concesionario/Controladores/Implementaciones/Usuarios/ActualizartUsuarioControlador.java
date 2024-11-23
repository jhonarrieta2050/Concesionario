package org.unicolombo.concesionario.Controladores.Implementaciones.Usuarios;

import org.unicolombo.concesionario.Controladores.Interfaces.Usuarios.IactualizarUsuarioControlador;
import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.CasosUso.Usuario.ActualizarUsuarioService;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.ActualizarUsuarioComand;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IactualizarUsuarioService;

public class ActualizartUsuarioControlador implements IactualizarUsuarioControlador {

    private IactualizarUsuarioService usuarioService;

    public ActualizartUsuarioControlador() {
        this.usuarioService = new ActualizarUsuarioService();
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        ActualizarUsuarioComand usuario1 = new ActualizarUsuarioComand(usuario.getIdUsuario(), usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getContrasena(), usuario.getCartera(), usuario.getVehiculosEnPropiedad());
        return usuarioService.actualizarUsuario(usuario1);
    }
}
