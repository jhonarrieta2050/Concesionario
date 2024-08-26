package org.unicolombo.concesionario.vistas;

import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;
import org.unicolombo.concesionario.controladores.Controlador;

import java.util.Scanner;

public class CompraVehiculo {
    private static Scanner sc = new Scanner(System.in);
    public static void comprarVehiculo(Vehiculos vehiculo) {

        System.out.println("Desea agregar adicionales a su vehiculo");
        System.out.println("1.Si o 2.No");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            agregarAdicionales();
        }

        System.out.println("Desea seder su vehiculo(Esto le ayudario a reducir el costo del vehiculo a comprar). El precio del vehiculo seria calculado basado en la marca y el modelo");
        System.out.println("1.Si o 2.No");
        opcion = sc.nextInt();
        if(opcion == 1) {
            sederVehiculo();
        }
        opcion = sc.nextInt();

    }
    public static void agregarAdicionales(){

    }
    public static int sederVehiculo() {
      return Controlador.verificarVehiculo();
    }
}
