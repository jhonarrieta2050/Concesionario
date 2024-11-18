package org.unicolombo.concesionario.Dominio.Constantes;

public enum Marca {
    BWM(1000),
    MERCEDES(900),
    AUDI(800),
    FORD(700),
    NISSAN(500);

    private final double valor;
    private Marca(int valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor; 
    }
}
