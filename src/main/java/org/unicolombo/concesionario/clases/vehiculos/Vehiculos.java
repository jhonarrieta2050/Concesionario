package org.unicolombo.concesionario.clases.vehiculos;

import org.unicolombo.concesionario.clases.vehiculos.accesorios.Accesorios;

import java.util.HashSet;

public abstract class Vehiculos {
    protected String marca;
    protected String modelo;
    protected String placa;
    protected String cilindrado;
    protected HashSet<Accesorios> adicionales;

    public Vehiculos(String marca, String modelo, String placa, String cilindrado) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cilindrado = cilindrado;
    }



    public void agregarAdicionales(Accesorios accesorios){
        adicionales.add(accesorios);
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cilindrado='" + cilindrado + '\'' +
                ", adicionales=" + adicionales.toString() +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCilindraje() {
        return cilindrado;
    }

    public HashSet<Accesorios> getAdicionales() {
        return adicionales;
    }
    
    
}
