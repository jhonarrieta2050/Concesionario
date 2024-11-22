package org.unicolombo.concesionario.Controladores.Implementaciones.Usuarios;

import org.unicolombo.concesionario.Controladores.Interfaces.Usuarios.IobtenerUsuarioControlador;
import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.CasosUso.Usuario.ObtenerUsuariosService;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto.ObtenerUsuarioRequest;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IobtenerUsuarioService;

import java.util.Optional;

public class ObtenerUsuarioControlador implements IobtenerUsuarioControlador {

    private IobtenerUsuarioService usuarioService;

    public ObtenerUsuarioControlador() {
        this.usuarioService = new ObtenerUsuariosService();
    }

    @Override
    public Optional<Usuario> obtenerUsuario(String nombre, String Contrasena) {
        ObtenerUsuarioRequest request = new ObtenerUsuarioRequest(nombre, Contrasena);
        return usuarioService.obtenerUsuario(request);
    }
}
