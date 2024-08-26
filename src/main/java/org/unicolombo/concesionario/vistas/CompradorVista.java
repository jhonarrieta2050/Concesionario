package org.unicolombo.concesionario.vistas;

import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;
import org.unicolombo.concesionario.controladores.Controlador;
import org.unicolombo.concesionario.controladores.ControladorInformacion;

import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;

public class CompradorVista {
    private static Scanner sc = new Scanner(System.in);

    public static void formulario(){

        System.out.println("Escriba su nombre");
        String nombre = sc.nextLine();
        System.out.println("Escriba su DNI");
        int dni = sc.nextInt();
        System.out.println("Escriba su direccion");
        String direccion = sc.nextLine();
        System.out.println("Escriba su telefono");
        int telefono = sc.nextInt();

        boolean verificarDatos = Controlador.verificarUsuario(nombre,dni,direccion,telefono);

        accion();


    }

    private static void accion(){
        System.out.println("1.Ver catalogo");
        System.out.println("2.Comprar vehiculo");
        System.out.println("3.Volver");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                verCatalogo();
                break;
                case 2:
                    buscarVehiculo();
        }
    }

    private static void verCatalogo(){
        HashSet<Vehiculos> catalogo = ControladorInformacion.ObtenerVehiculos();

        catalogo.forEach(v -> System.out.println(v.toString()));

    }

    private static boolean buscarVehiculo(){
        System.out.println("Escriba el nombre del vehiculo");
        String nombre = sc.nextLine();
        Optional<Vehiculos> vehiculos = ControladorInformacion.ObtenerVehiculo(nombre);
        if(vehiculos.isEmpty()){
            System.out.println("No se a encontrado el vehiculo");
            return false;
        }
        System.out.println("Se ha encontrado correctamente el vehiculo");
        System.out.println("1.Comprar vehiculo");
        System.out.println("2.volver");
        int opcion = sc.nextInt();
        if(opcion == 1){
            CompraVehiculo.comprarVehiculo(vehiculos.get());
        }else {
            return false;
        }
        return true;
    }
}
