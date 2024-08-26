package org.unicolombo.concesionario.clases.usuario;

public class Usuario {
    private String nombre;
    private int DNI;
    private String Direccion;
    private int telefono;
    private boolean vendedor;
    public Usuario(String nombre, int DNI, String Direccion, int telefono, boolean vendedor) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.vendedor = vendedor;
    };

}
