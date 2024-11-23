package org.unicolombo.concesionario.utilidades;

import java.util.ArrayList;
import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;

import java.util.HashSet;
import java.util.Optional;
import org.unicolombo.concesionario.Dominio.Modelos.Factura;
import org.unicolombo.concesionario.Dominio.Modelos.Accesorios;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Comandos.ComandosBasicosInterface;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.ConsultasBasicasInterfaces;

public class ControladorInformacion {
    
    private ComandosBasicosInterface comandRepositoryInterface;
    private ConsultasBasicasInterfaces quaryRepositoryInterface;
    
    
    
    
    
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
    
    public static void guardarFactura(Factura facturaa){
        BaseDatos.setFacturas(facturaa);
    }
    public static void eliminarVehiculo(Vehiculos vehiculos){
        BaseDatos.getCatalogo().remove(vehiculos);
    }
}
