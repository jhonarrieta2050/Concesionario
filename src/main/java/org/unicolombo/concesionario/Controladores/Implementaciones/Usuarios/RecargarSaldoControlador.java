package org.unicolombo.concesionario.Controladores.Implementaciones.Usuarios;

import org.unicolombo.concesionario.Controladores.Interfaces.Usuarios.IrecargarSaldoControlador;
import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.CasosUso.Usuario.RecargarSaldoService;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.RecargarUsuarioComand;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IrecargarSaldoService;

public class RecargarSaldoControlador implements IrecargarSaldoControlador {

    private IrecargarSaldoService recargarSaldoService;

    public RecargarSaldoControlador() {
        this.recargarSaldoService = new RecargarSaldoService();
    }

    @Override
    public Usuario recargarSaldo(int idUsuario, double saldo) {
        RecargarUsuarioComand usuarioComand = new RecargarUsuarioComand(idUsuario, saldo);
       return recargarSaldoService.recargarSaldo(usuarioComand);
    }
}
