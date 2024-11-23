package org.unicolombo.concesionario.negocio.CasosUso.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.ActualizarUsuarioHandler;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.ActualizarUsuarioComand;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IactualizarUsuarioService;
import org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario.IactualizarUsuarioHandler;

public class ActualizarUsuarioService implements IactualizarUsuarioService {

    private IactualizarUsuarioHandler handler;

    public ActualizarUsuarioService() {
        this.handler = new ActualizarUsuarioHandler();
    }

    @Override
    public Usuario actualizarUsuario(ActualizarUsuarioComand usuario) {
       return handler.actualizarUsuario(usuario);
    }
}
