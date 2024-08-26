package org.unicolombo.concesionario.controladores;

import org.unicolombo.concesionario.clases.vehiculos.Automoviles;
import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;

import java.util.Scanner;

public class Controlador {
    private static Scanner sc = new Scanner(System.in);

    public static boolean verificarUsuario(String nombre, int dni, String direccion, int telefono) {
        return true;
    }

    public static int verificarVehiculo(){
        System.out.println("Escriba la marca");
        String marca = sc.nextLine();
        System.out.println("Escriba la Modelo");
        String modelo = sc.nextLine();
        System.out.println("Escriba la placa");
        String placa = sc.nextLine();
        System.out.println("Escriba el cilindrado");
        String cilindrado = sc.nextLine();
        ControladorInformacion.guardarVehiculoSedido(new Automoviles(marca,modelo,placa,cilindrado));

        return verificarPrecio(new Automoviles(marca,modelo,placa,cilindrado));
    }

    public static int verificarPrecio(Vehiculos vehiculos){
        return 1;
    }
}
