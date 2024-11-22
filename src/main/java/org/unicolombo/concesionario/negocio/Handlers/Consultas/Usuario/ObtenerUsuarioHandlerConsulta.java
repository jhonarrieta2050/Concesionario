package org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario;

import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.ConsultasBasicasInterfaces;
import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto.ObtenerUsuarioRequest;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Consultas.Usuario.ConsultaUsuarioRepositorioImp;
import org.unicolombo.concesionario.negocio.Interface.Consultas.Usuario.IusuarioHandlerQuarys;

import java.util.Optional;

public class ObtenerUsuarioHandlerConsulta implements IusuarioHandlerQuarys {

    private ConsultasBasicasInterfaces consultaUsuarioRepositorioImp;

    public ObtenerUsuarioHandlerConsulta() {
        this.consultaUsuarioRepositorioImp = new ConsultaUsuarioRepositorioImp();
    }

    public Optional<Usuario> consultarUsuario(ObtenerUsuarioRequest obtenerUsuarioRequest){
        return consultaUsuarioRepositorioImp.buscarObjeto( new Usuario(null, null, obtenerUsuarioRequest.getCorreo(), obtenerUsuarioRequest.getContrasena()));

    }
}
