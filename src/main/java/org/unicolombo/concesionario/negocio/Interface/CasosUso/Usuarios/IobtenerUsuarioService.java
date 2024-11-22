package org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto.ObtenerUsuarioRequest;

import java.util.Optional;

public interface IobtenerUsuarioService {
    public Optional<Usuario> obtenerUsuario(ObtenerUsuarioRequest usuario);
}
