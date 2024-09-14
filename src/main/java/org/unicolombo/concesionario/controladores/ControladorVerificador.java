package org.unicolombo.concesionario.controladores;

import org.unicolombo.concesionario.clases.vehiculos.Automoviles;
import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;

import java.util.Scanner;

public class ControladorVerificador {
    private static Scanner sc = new Scanner(System.in);

    public static boolean verificarUsuario(String nombre, String dni, String direccion, String telefono) {
        if(nombre.isBlank() || !nombre.matches("[a-zA-Z]+") ){
            return false;
        }
        
        if(dni.isBlank() || !dni.matches("[0-9]+")){
            return false;
        }
        
        if(direccion.isBlank()){
            return false;
        }
        
        if(telefono.isBlank() || !dni.matches("[0-9]+")){
            return false;
        }
        return true;
    }
    
    public static boolean verificarUsuario(String nombre, String dni) {
        if(nombre.isBlank() || !nombre.matches("[a-zA-Z]+") ){
            return false;
        }
        
        if(dni.isBlank() || !dni.matches("[0-9]+")){
            return false;
        }
        return true;
    }
    

    public static boolean verificarPresupuesto(double precioDelAuto, double carteraDelUsuario){
        return precioDelAuto <= carteraDelUsuario;
    }
    
   
}
