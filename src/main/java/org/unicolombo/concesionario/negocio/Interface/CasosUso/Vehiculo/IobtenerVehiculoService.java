package org.unicolombo.concesionario.negocio.Interface.CasosUso.Vehiculo;

import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;

import java.util.HashSet;

public interface IobtenerVehiculoService {
    public HashSet<Vehiculos> obtenerVehiculos();
}
