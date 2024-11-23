package org.unicolombo.concesionario.utilidades;

import java.util.Scanner;

public class ControladorVerificador {
    private static Scanner sc = new Scanner(System.in);

    public static boolean verificarUsuario(String nombre, String apellido, String correo, String contrasena) {
        if(nombre.isBlank() || !nombre.matches("[a-zA-Z]+") ){
            return false;
        }
        
        if(apellido.isBlank() || !apellido.matches("[a-zA-Z]+") ){
            return false;
        }
        
        if(correo.isBlank() || !correo.matches("[a-zA-Z]+") ){
            return false;
        }
        
        if(contrasena.isBlank() || !contrasena.matches("[a-zA-Z]+") ){
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
    

    public boolean verificarPresupuesto(double precioDelAuto, double carteraDelUsuario){
        return precioDelAuto <= carteraDelUsuario;
    }
    
   
}
