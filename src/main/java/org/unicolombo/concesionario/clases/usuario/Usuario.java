package org.unicolombo.concesionario.clases.usuario;

import java.util.HashSet;
import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private double cartera;
    private HashSet<Vehiculos> vehiculosEnPropiedad;

    public Usuario(int idUsuario, String nombre, String apellido, String correo, String contrasena, double cartera, HashSet<Vehiculos> vehiculosEnPropiedad) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.cartera = cartera;
        this.vehiculosEnPropiedad = vehiculosEnPropiedad;
    }

    public Usuario(String nombre, String apellido, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
     
}
