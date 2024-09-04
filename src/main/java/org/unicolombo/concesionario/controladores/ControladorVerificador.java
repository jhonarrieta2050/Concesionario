package org.unicolombo.concesionario.controladores;

import org.unicolombo.concesionario.clases.vehiculos.Automoviles;
import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;

import java.util.Scanner;

public class ControladorVerificador {
    private static Scanner sc = new Scanner(System.in);

    public static boolean verificarUsuario(String nombre, int dni, String direccion, int telefono) {
        return true;
    }


    public static boolean verificarPresupuesto(double precioDelAuto, double carteraDelUsuario){
        return precioDelAuto <= carteraDelUsuario;
    }
}
