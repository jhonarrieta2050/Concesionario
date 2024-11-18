package org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario;

import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.CrearUsuarioComand;

public interface IcrearUsuarioHandlerComand {
     public void guardarUsuario(CrearUsuarioComand usuarioComand) throws Exception;
}
