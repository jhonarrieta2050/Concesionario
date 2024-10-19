package org.unicolombo.concesionario;


import org.unicolombo.concesionario.vistas.PrincipalLoginGui;

public class Main {
    private static PrincipalLoginGui bienvenida = new PrincipalLoginGui();
    public static void main(String[] args) {
        bienvenida.setVisible(true);
        bienvenida.setLocationRelativeTo(null);
        
    }
}