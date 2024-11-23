package org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario;

import org.unicolombo.concesionario.Dominio.Modelos.Usuario;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Comandos.Usuario.RecargarUsuarioQuary;
import org.unicolombo.concesionario.negocio.Handlers.Comandos.Usuario.Dto.RecargarUsuarioComand;
import org.unicolombo.concesionario.negocio.Interface.Comandos.Usuario.IrecargarUsuarioHandler;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Comandos.Usuario.IrecargarUsuarioQuary;

public class RecargarUsuarioHandler implements IrecargarUsuarioHandler {

   private IrecargarUsuarioQuary quary;

   public RecargarUsuarioHandler() {
       this.quary = new RecargarUsuarioQuary();
   }

    @Override
    public Usuario recargarUsuario(RecargarUsuarioComand usuario) {
       Usuario usuarioDto = new Usuario();
       usuarioDto.setIdUsuario(usuario.getIdUsuario());
       usuarioDto.setCartera(usuario.getSaldo());
        return quary.recargarUsuario(usuarioDto);
    }
}
