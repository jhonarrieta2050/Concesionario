package org.unicolombo.concesionario.Controladores.Implementaciones.Accesorios;

import org.unicolombo.concesionario.Controladores.Interfaces.Accesorios.IobtenerAccesoriosControlador;
import org.unicolombo.concesionario.Dominio.Modelos.Accesorios;
import org.unicolombo.concesionario.negocio.CasosUso.Accesorios.ObtenerAccesoriosService;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Accesorios.IobtenerAccesoriosService;

import java.util.ArrayList;

public class ObtenerAccesoriosControlador implements IobtenerAccesoriosControlador {

    private IobtenerAccesoriosService obtener;

    public ObtenerAccesoriosControlador() {
        this.obtener = new ObtenerAccesoriosService();
    }

    @Override
    public ArrayList<Accesorios> obtenerAccesorios() {
        return obtener.obtenerAccesorios();
    }
}
