package org.unicolombo.concesionario.negocio.CasosUso.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto.ObtenerUsuarioRequest;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.ObtenerUsuarioHandlerConsulta;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IobtenerUsuarioService;

import java.util.Optional;

public class ObtenerUsuariosService implements IobtenerUsuarioService {

    private final ObtenerUsuarioHandlerConsulta obtConsulta;

    public ObtenerUsuariosService() {
        obtConsulta = new ObtenerUsuarioHandlerConsulta();
    }

    @Override
    public Optional<Usuario> obtenerUsuario(ObtenerUsuarioRequest usuarioRequest) {
        return obtConsulta.consultarUsuario(usuarioRequest);
    }
}
