package org.unicolombo.concesionario.negocio.CasosUso.Accesorios;

import org.unicolombo.concesionario.Dominio.Modelos.Accesorios;
import org.unicolombo.concesionario.negocio.Handlers.Consultas.Accesorios.ObtenerAccesoriosHandler;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Accesorios.IobtenerAccesoriosService;
import org.unicolombo.concesionario.negocio.Interface.Consultas.Accesorio.IobtenerAccesoriosHandler;

import java.util.ArrayList;

public class ObtenerAccesoriosService implements IobtenerAccesoriosService {

    private IobtenerAccesoriosHandler obtenerAccesoriosHandler;

    public ObtenerAccesoriosService() {
        this.obtenerAccesoriosHandler = new ObtenerAccesoriosHandler();
    }

    @Override
    public ArrayList<Accesorios> obtenerAccesorios() {
        return obtenerAccesoriosHandler.obtenerAccesorios();
    }
}
