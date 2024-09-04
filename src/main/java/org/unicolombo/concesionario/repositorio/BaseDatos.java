package org.unicolombo.concesionario.repositorio;

import java.util.ArrayList;
import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;

import java.util.HashSet;
import org.unicolombo.concesionario.clases.vehiculos.Automoviles;
import org.unicolombo.concesionario.clases.vehiculos.accesorios.Accesorios;

public class BaseDatos {
    private static HashSet<Vehiculos> catalogo;
    private static HashSet<Vehiculos> vehiculosSedidos;
    private static ArrayList<Accesorios> accesorios;

    static {
        catalogo = new HashSet<>();
        vehiculosSedidos = new HashSet<>();
        catalogo.add(new Automoviles("BMW", "Serie 3", "ABC123", "2000cc", 35000));
        catalogo.add(new Automoviles("BMW", "X5", "DEF456", "3000cc", 60000));
        catalogo.add(new Automoviles("BMW", "M4", "GHI789", "3000cc", 70000));

        catalogo.add(new Automoviles("Mercedes", "Clase C", "JKL012", "2200cc", 40000));
        catalogo.add(new Automoviles("Mercedes", "GLA", "MNO345", "2500cc", 45000));
        catalogo.add(new Automoviles("Mercedes", "SLC", "PQR678", "3000cc", 75000));

        catalogo.add(new Automoviles("Audi", "A4", "STU901", "2000cc", 37000));
        catalogo.add(new Automoviles("Audi", "Q5", "VWX234", "2400cc", 55000));
        catalogo.add(new Automoviles("Audi", "R8", "YZA567", "5200cc", 150000));

        catalogo.add(new Automoviles("Ford", "Mustang", "BCD890", "5000cc", 65000));
        catalogo.add(new Automoviles("Ford", "Fiesta", "EFG123", "1600cc", 20000));
        catalogo.add(new Automoviles("Ford", "Explorer", "HIJ456", "3000cc", 45000));

        catalogo.add(new Automoviles("Nissan", "Altima", "KLM789", "2500cc", 32000));
        catalogo.add(new Automoviles("Nissan", "GT-R", "NOP012", "3800cc", 110000));
        catalogo.add(new Automoviles("Nissan", "Murano", "QRS345", "3500cc", 45000));
        
        accesorios = new ArrayList<>();
        accesorios.add(new Accesorios("Sistema de sonido premium", "Sonido envolvente con bajos mejorados", 1500));
        accesorios.add(new Accesorios("Asientos de cuero", "Asientos tapizados en cuero de alta calidad", 2000));
        accesorios.add(new Accesorios("Navegación GPS", "Sistema de navegación por satélite integrado", 1000));
        accesorios.add(new Accesorios("Cámara de reversa", "Cámara trasera con vista panorámica", 750));
        accesorios.add(new Accesorios("Techo solar", "Techo corredizo eléctrico", 1200));
        accesorios.add(new Accesorios("Faros LED", "Faros delanteros con tecnología LED", 800));
        accesorios.add(new Accesorios("Control de crucero adaptativo", "Sistema de control de velocidad con detección de vehículos", 1700));
        accesorios.add(new Accesorios("Sensor de estacionamiento", "Sensores para facilitar el estacionamiento", 500));
        accesorios.add(new Accesorios("Sistema de frenado automático", "Frenado automático en situaciones de emergencia", 2200));
        accesorios.add(new Accesorios("Asistente de mantenimiento de carril", "Sistema que ayuda a mantener el vehículo en su carril", 1300));
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

    public static ArrayList<Accesorios> getAccesorios() {
        return accesorios;
    }
    
}
