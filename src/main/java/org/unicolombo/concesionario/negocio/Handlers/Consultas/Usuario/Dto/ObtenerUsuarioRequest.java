package org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto;

public class ObtenerUsuarioRequest {
    private String correo;
    private String contrasena;

    public ObtenerUsuarioRequest(String contrasena, String correo) {
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
