package org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios;

import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.CrearUsuarioComand;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.UsuarioHandlerComand;

public interface IcrearUsuarioService {
    public void crearUsuario(CrearUsuarioComand usuarioHandlerComand);
}
