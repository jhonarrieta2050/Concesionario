package org.unicolombo.concesionario.clases.usuario.consultas;

import org.unicolombo.concesionario.clases.interfaces.QuaryRepositoryInterface;
import org.unicolombo.concesionario.clases.usuario.modelo.Usuario;
import org.unicolombo.concesionario.clases.usuario.repositorios.ConsultaUsuarioRepositorioImp;

import java.util.Optional;

public class UsuarioHandlerQuarys {

    private QuaryRepositoryInterface consultaUsuarioRepositorioImp;

    public UsuarioHandlerQuarys() {
        this.consultaUsuarioRepositorioImp = new ConsultaUsuarioRepositorioImp();
    }

    public Optional<Usuario> consultarUsuario(ConsultarUsuarioQuary consultarUsuarioQuary){
        return consultaUsuarioRepositorioImp.buscarObjeto( new Usuario(null, null, consultarUsuarioQuary.getCorreo(), consultarUsuarioQuary.getContrasena()));

    }
}
