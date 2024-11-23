package org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.ActualizarUsuarioComand;

public interface IactualizarUsuarioHandler {
    public Usuario actualizarUsuario(ActualizarUsuarioComand usuario);
}
