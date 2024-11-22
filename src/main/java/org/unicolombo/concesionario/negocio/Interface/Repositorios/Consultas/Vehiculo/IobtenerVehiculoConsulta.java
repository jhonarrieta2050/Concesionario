package org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.Vehiculo;

import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;

import java.util.HashSet;

public interface IobtenerVehiculoConsulta {
    public HashSet<Vehiculos> obtenerVehiculos();
}
