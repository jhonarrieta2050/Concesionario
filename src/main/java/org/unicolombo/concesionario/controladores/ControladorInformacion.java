package org.unicolombo.concesionario.controladores;

import java.util.ArrayList;
import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;
import org.unicolombo.concesionario.repositorio.BaseDatos;

import java.util.HashSet;
import java.util.Optional;
import org.unicolombo.concesionario.clases.compras.factura;
import org.unicolombo.concesionario.clases.vehiculos.accesorios.Accesorios;

public class ControladorInformacion {

    public static HashSet<Vehiculos> ObtenerVehiculos(){
        return BaseDatos.getCatalogo();
    }
    public static ArrayList<Accesorios> ObtenerAccesorios(){
        return BaseDatos.getAccesorios();
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
    
    public static void guardarFactura(factura facturaa){
        BaseDatos.setFacturas(facturaa);
    }
}
