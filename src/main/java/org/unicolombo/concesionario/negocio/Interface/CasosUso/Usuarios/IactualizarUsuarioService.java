package org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.ActualizarUsuarioComand;

public interface IactualizarUsuarioService {
    public Usuario actualizarUsuario(ActualizarUsuarioComand usuario);
}
