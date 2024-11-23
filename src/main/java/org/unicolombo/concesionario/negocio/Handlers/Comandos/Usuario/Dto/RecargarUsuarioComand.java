package org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto;

public class RecargarUsuarioComand {
    private int idUsuario;
    private double saldo;

    public RecargarUsuarioComand(int idUsuario, double saldo) {
        this.idUsuario = idUsuario;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
