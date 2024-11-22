package org.unicolombo.concesionario.Controladores.Interfaces.Usuarios;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;

import java.util.Optional;

public interface IobtenerUsuarioControlador {
    public Optional<Usuario> obtenerUsuario(String nombre, String contrasena);
}
