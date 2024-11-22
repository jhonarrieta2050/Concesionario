package org.unicolombo.concesionario.negocio.Handlers.Consultas.Vehiculo;

import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Consultas.Vehiculo.ConsultaVehiculoRepositorio;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Consultas.Vehiculo.ObtenerVehiculoQuary;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Vehiculo.IobtenerVehiculoService;
import org.unicolombo.concesionario.negocio.Interface.Consultas.Vehiculo.IobtenerVehiculoHanlder;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.ConsultasBasicasInterfaces;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.Vehiculo.IobtenerVehiculoConsulta;

import java.util.HashSet;

public class ObtenerVehiculoHandlerConsulta implements IobtenerVehiculoHanlder {

   private IobtenerVehiculoConsulta consultas;

   public ObtenerVehiculoHandlerConsulta() {
       this.consultas = new ObtenerVehiculoQuary();
   }

    @Override
    public HashSet<Vehiculos> obtenerVehiculosHanlder() {
        return consultas.obtenerVehiculos();
    }
}
