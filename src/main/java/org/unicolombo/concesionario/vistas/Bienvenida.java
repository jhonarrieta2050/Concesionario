package org.unicolombo.concesionario.vistas;

import java.util.Scanner;

public class Bienvenida {
    private static Scanner entrada = new Scanner(System.in);

    public static void Bienvenida(){
        System.out.println("Bienvenido");
        System.out.println("Es un comprador o vendedor");
        System.out.println("1.Comprador");
        System.out.println("2.vendedor");
        int op = entrada.nextInt();
        switch (op){
            case 1:
                CompradorVista.formulario();
                break;
                case 2:

        }
    }
}
