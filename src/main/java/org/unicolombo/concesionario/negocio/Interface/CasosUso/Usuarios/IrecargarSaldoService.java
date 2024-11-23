package org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.RecargarUsuarioComand;

public interface IrecargarSaldoService {
    public Usuario recargarSaldo(RecargarUsuarioComand usuario);
}
