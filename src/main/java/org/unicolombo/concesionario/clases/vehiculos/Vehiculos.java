package org.unicolombo.concesionario.clases.vehiculos;

import org.unicolombo.concesionario.clases.vehiculos.accesorios.Accesorios;

import java.util.HashSet;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.marca);
        hash = 71 * hash + Objects.hashCode(this.modelo);
        hash = 71 * hash + Objects.hashCode(this.placa);
        hash = 71 * hash + Objects.hashCode(this.cilindrado);
        hash = 71 * hash + Objects.hashCode(this.distribuidor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculos other = (Vehiculos) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.cilindrado, other.cilindrado)) {
            return false;
        }
        return Objects.equals(this.distribuidor, other.distribuidor);
    }
    
    
}
