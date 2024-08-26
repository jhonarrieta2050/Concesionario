package org.unicolombo.concesionario.controladores;

import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;
import org.unicolombo.concesionario.repositorio.BaseDatos;

import java.util.HashSet;
import java.util.Optional;

public class ControladorInformacion {

    public static HashSet<Vehiculos> ObtenerVehiculos(){
        return BaseDatos.getCatalogo();
    }

    public static Optional<Vehiculos> ObtenerVehiculo(String modeloVehiculo){
        return BaseDatos.getCatalogo().stream().filter(V ->V.getModelo().equals(modeloVehiculo)).findFirst();
    }

    public static void guardarVehiculo(Vehiculos vehiculo){
        BaseDatos.getCatalogo().add(vehiculo);
    }
    public static void guardarVehiculoSedido(Vehiculos vehiculo){
        BaseDatos.setVehiculosSedidos(vehiculo);
    }
}
