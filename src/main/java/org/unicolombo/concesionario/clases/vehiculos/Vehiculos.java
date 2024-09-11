package org.unicolombo.concesionario.clases.vehiculos;

import org.unicolombo.concesionario.clases.vehiculos.accesorios.Accesorios;

import java.util.HashSet;

public abstract class Vehiculos {
    protected String marca;
    protected String modelo;
    protected String placa;
    protected String cilindrado;
    protected double precio;
    protected HashSet<Accesorios> adicionales;
    protected String distribuidor;
    public Vehiculos(String marca, String modelo, String placa, String cilindrado,double precio,String distribuidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cilindrado = cilindrado;
        this.precio = precio;
        this.distribuidor = distribuidor;
        adicionales = new HashSet();
    }

    private void actualizarDatos(){
        
    }

    public void agregarAdicionales(Accesorios accesorios){
        adicionales.add(accesorios);
        precio += accesorios.getPrecio();
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(String cilindrado) {
        this.cilindrado = cilindrado;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }
    
    
}
