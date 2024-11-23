package org.unicolombo.concesionario.Controladores.Interfaces.Usuarios;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;

public interface IrecargarSaldoControlador {
    public Usuario recargarSaldo(int idUsuario, double saldo);
}
