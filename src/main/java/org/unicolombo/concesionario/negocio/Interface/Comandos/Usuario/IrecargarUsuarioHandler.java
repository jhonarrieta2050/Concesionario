package org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.RecargarUsuarioComand;

public interface IrecargarUsuarioHandler {
    public Usuario recargarUsuario(RecargarUsuarioComand usuario);
}
