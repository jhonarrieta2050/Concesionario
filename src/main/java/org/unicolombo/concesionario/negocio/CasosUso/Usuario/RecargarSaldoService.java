package org.unicolombo.concesionario.negocio.CasosUso.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.RecargarUsuarioComand;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.RecargarUsuarioHandler;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IrecargarSaldoService;
import org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario.IrecargarUsuarioHandler;

public class RecargarSaldoService implements IrecargarSaldoService {

    private IrecargarUsuarioHandler recargarSaldoService;

    public RecargarSaldoService() {
        this.recargarSaldoService = new RecargarUsuarioHandler();
    }

    @Override
    public Usuario recargarSaldo(RecargarUsuarioComand usuario) {
       return recargarSaldoService.recargarUsuario(usuario);
    }
}
