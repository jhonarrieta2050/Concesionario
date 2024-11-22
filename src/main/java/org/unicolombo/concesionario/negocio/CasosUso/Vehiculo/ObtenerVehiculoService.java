package org.unicolombo.concesionario.negocio.CasosUso.Vehiculo;

import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Vehiculo.ObtenerVehiculoHandlerConsulta;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Vehiculo.IobtenerVehiculoService;
import org.unicolombo.concesionario.negocio.Interface.Consultas.Vehiculo.IobtenerVehiculoHanlder;

import java.util.HashSet;

public class ObtenerVehiculoService implements IobtenerVehiculoService {

    private IobtenerVehiculoHanlder obtenerVehiculoHanlder;

    public ObtenerVehiculoService() {
        this.obtenerVehiculoHanlder = new ObtenerVehiculoHandlerConsulta();
    }

    @Override
    public HashSet<Vehiculos> obtenerVehiculos() {
        return obtenerVehiculoHanlder.obtenerVehiculosHanlder();
    }
}
