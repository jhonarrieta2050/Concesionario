package org.unicolombo.concesionario.clases.usuario.consultas;

public class ConsultarUsuarioQuary {
    private String correo;
    private String contrasena;

    public ConsultarUsuarioQuary(String contrasena, String correo) {
        this.contrasena = contrasena;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
}
