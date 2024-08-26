package org.unicolombo.concesionario.clases.vehiculos.accesorios;

public abstract class Accesorios {
    protected String nombre;
    protected String descripcion;

    public Accesorios() {

    }

    @Override
    public String toString() {
        return "Accesorios{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
