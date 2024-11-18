package org.unicolombo.concesionario.negocio.CasosUso.Usuario;

import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.CrearUsuarioComand;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.UsuarioHandlerComand;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IcrearUsuarioService;
import org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario.IcrearUsuarioHandlerComand;

public class CrearUsuarioService implements IcrearUsuarioService {

    IcrearUsuarioHandlerComand usuarioHandlerComand;

    public CrearUsuarioService() {
        this.usuarioHandlerComand = new UsuarioHandlerComand();
    }

    @Override
    public void crearUsuario(CrearUsuarioComand usuario) {
        try {
            usuarioHandlerComand.guardarUsuario(usuario);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
