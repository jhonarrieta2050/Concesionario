package org.unicolombo.concesionario.Controladores.Implementaciones.Vehiculo;

import org.unicolombo.concesionario.Controladores.Interfaces.Vehiculo.IobtenerVehiculoControlador;
import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;
import org.unicolombo.concesionario.negocio.CasosUso.Vehiculo.ObtenerVehiculoService;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Vehiculo.IobtenerVehiculoService;

import java.util.HashSet;

public class ObtenerVehiculoControlador implements IobtenerVehiculoControlador {

    private IobtenerVehiculoService vehiculoService;

    public ObtenerVehiculoControlador() {
        this.vehiculoService = new ObtenerVehiculoService();
    }

    @Override
    public HashSet<Vehiculos> obtenerVehiculos() {
        return vehiculoService.obtenerVehiculos();
    }
}
