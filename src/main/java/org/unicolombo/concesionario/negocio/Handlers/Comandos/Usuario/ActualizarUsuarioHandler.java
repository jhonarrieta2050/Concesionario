package org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Comandos.Usuario.ActualizarUsuarioQuary;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.ActualizarUsuarioComand;
import org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario.IactualizarUsuarioHandler;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Comandos.Usuario.IactualizarUsuarioQuary;

public class ActualizarUsuarioHandler implements IactualizarUsuarioHandler {

    private IactualizarUsuarioQuary usuarioQuary;


    public ActualizarUsuarioHandler() {
        this.usuarioQuary = new ActualizarUsuarioQuary();
    }

    @Override
    public Usuario actualizarUsuario(ActualizarUsuarioComand usuario) {
        Usuario usuario1 = new Usuario(usuario.getIdUsuario(), usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getContrasena(), usuario.getCartera(), usuario.getVehiculosEnPropiedad());
        return this.usuarioQuary.actualizarUsuario(usuario1);
    }
}
