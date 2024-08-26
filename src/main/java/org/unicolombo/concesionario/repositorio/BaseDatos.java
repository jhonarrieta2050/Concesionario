package org.unicolombo.concesionario.repositorio;

import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;

import java.util.HashSet;
import org.unicolombo.concesionario.clases.vehiculos.Automoviles;

public class BaseDatos {
    private static HashSet<Vehiculos> catalogo;
    private static HashSet<Vehiculos> vehiculosSedidos;

    static {
        catalogo = new HashSet<>();
        vehiculosSedidos = new HashSet<>();
        catalogo.add(new Automoviles("BMW", "Serie 3", "ABC123", "2000cc"));
        catalogo.add(new Automoviles("BMW", "X5", "DEF456", "3000cc"));
        catalogo.add(new Automoviles("Mercedes", "Clase C", "GHI789", "2200cc"));
        catalogo.add(new Automoviles("Mercedes", "GLA", "JKL012", "2500cc"));
        catalogo.add(new Automoviles("Audi", "A4", "MNO345", "2000cc"));
        catalogo.add(new Automoviles("Audi", "Q5", "PQR678", "2400cc"));
        catalogo.add(new Automoviles("Ford", "Mustang", "STU901", "5000cc"));
        catalogo.add(new Automoviles("Ford", "Fiesta", "VWX234", "1600cc"));
        catalogo.add(new Automoviles("Nissan", "Altima", "YZA567", "2500cc"));
        catalogo.add(new Automoviles("Nissan", "GT-R", "BCD890", "3800cc"));
    }

    public static HashSet<Vehiculos> getCatalogo() {
        return catalogo;
    }

    public static void setVehiculos(Vehiculos vehiculos) {
        catalogo.add(vehiculos);
    }

    public static void setVehiculosSedidos(Vehiculos vehiculosSedido) {
        vehiculosSedidos.add(vehiculosSedido);
    }
}
