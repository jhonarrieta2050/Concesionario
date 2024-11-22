package org.unicolombo.concesionario.negocio.Handlers.Consultas.Accesorios;

import org.unicolombo.concesionario.Dominio.Modelos.Accesorios;
import org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Consultas.Accesorios.ObtenerAccesoriosQuary;
import org.unicolombo.concesionario.negocio.Interface.Consultas.Accesorio.IobtenerAccesoriosHandler;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.Accesorios.IobtenerAccesoriosQuary;

import java.util.ArrayList;

public class ObtenerAccesoriosHandler implements IobtenerAccesoriosHandler {

    private IobtenerAccesoriosQuary obtenerAccesoriosQuary;

    public ObtenerAccesoriosHandler() {
        this.obtenerAccesoriosQuary = new ObtenerAccesoriosQuary();
    }

    @Override
    public ArrayList<Accesorios> obtenerAccesorios() {
        return obtenerAccesoriosQuary.obtenerAccesorios();
    }
}
