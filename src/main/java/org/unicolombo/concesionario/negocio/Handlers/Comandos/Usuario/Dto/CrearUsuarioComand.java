package org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto;

public class CrearUsuarioComand {
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;

    public CrearUsuarioComand(String correo, String contrasena, String apellido, String nombre) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.apellido = apellido;
        this.nombre = nombre;
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
}
