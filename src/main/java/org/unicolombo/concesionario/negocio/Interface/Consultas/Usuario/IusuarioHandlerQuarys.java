package org.unicolombo.concesionario.negocio.Interface.Consultas.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto.ConsultarUsuarioQuary;

import java.util.Optional;

public interface IusuarioHandlerQuarys {
    Optional<Usuario> consultarUsuario(ConsultarUsuarioQuary consultarUsuarioQuary);
}
