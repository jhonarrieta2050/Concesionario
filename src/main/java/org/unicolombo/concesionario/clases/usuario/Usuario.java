package org.unicolombo.concesionario.clases.usuario;

import java.util.HashSet;
import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;

public class Usuario {
    private String nombre;
    private int DNI;
    private String Direccion;
    private int telefono;
    private boolean vendedor;
    private double cartera;
    private HashSet<Vehiculos> vehiculosEnPropiedad;
    public Usuario(String nombre, int DNI, String Direccion, int telefono, boolean vendedor,double cartera) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.vendedor = vendedor;
        this.cartera = cartera;
        vehiculosEnPropiedad = new HashSet();
    };
    
    public Usuario(String nombre, int Dni,boolean vendedor){
        this.nombre = nombre;
        this.DNI = Dni;
        this.vendedor = vendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isVendedor() {
        return vendedor;
    }

    public void setVendedor(boolean vendedor) {
        this.vendedor = vendedor;
    }

    public double getCartera() {
        return cartera;
    }

    public void setCartera(double cartera) {
        this.cartera = cartera;
    }

    public HashSet<Vehiculos> getVehiculosEnPropiedad() {
        return vehiculosEnPropiedad;
    }

    public void setVehiculosEnPropiedad(HashSet<Vehiculos> vehiculosEnPropiedad) {
        this.vehiculosEnPropiedad = vehiculosEnPropiedad;
    }
     
}
