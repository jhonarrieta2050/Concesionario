package org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario;

import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.ConsultasBasicasInterfaces;
import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto.ConsultarUsuarioQuary;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Usuario.Dto.ConsultaUsuarioRepositorioImp;
import org.unicolombo.concesionario.negocio.Interface.Consultas.Usuario.IusuarioHandlerQuarys;

import java.util.Optional;

public class UsuarioHandlerQuarys implements IusuarioHandlerQuarys {

    private ConsultasBasicasInterfaces consultaUsuarioRepositorioImp;

    public UsuarioHandlerQuarys() {
        this.consultaUsuarioRepositorioImp = new ConsultaUsuarioRepositorioImp();
    }

    public Optional<Usuario> consultarUsuario(ConsultarUsuarioQuary consultarUsuarioQuary){
        return consultaUsuarioRepositorioImp.buscarObjeto( new Usuario(null, null, consultarUsuarioQuary.getCorreo(), consultarUsuarioQuary.getContrasena()));

    }
}
