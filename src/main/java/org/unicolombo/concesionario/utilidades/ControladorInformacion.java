package org.unicolombo.concesionario.utilidades;

import java.util.ArrayList;
import org.unicolombo.concesionario.clases.vehiculo.modelo.Vehiculos;

import java.util.HashSet;
import java.util.Optional;
import org.unicolombo.concesionario.clases.facturas.modelo.factura;
import org.unicolombo.concesionario.clases.accesorio.modelo.Accesorios;
import org.unicolombo.concesionario.clases.interfaces.ComandRepositoryInterface;
import org.unicolombo.concesionario.clases.interfaces.QuaryRepositoryInterface;

public class ControladorInformacion {
    
    private ComandRepositoryInterface comandRepositoryInterface;
    private QuaryRepositoryInterface quaryRepositoryInterface;
    
    
    
    
    
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
    public static void eliminarVehiculo(Vehiculos vehiculos){
        BaseDatos.getCatalogo().remove(vehiculos);
    }
}
