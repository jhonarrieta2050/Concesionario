package org.unicolombo.concesionario.Controladores.Interfaces.Vehiculo;

import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;

import java.util.HashSet;

public interface IobtenerVehiculoControlador {
    public HashSet<Vehiculos> obtenerVehiculos();
}
