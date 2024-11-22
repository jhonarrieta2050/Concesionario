package org.unicolombo.concesionario.Infraestructura.Persistencia.Repositorio.Consultas.Vehiculo;

import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;
import org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas.ConsultasBasicasInterfaces;

import java.util.Optional;

public class ConsultaVehiculoRepositorio implements ConsultasBasicasInterfaces<Vehiculos> {
    @Override
    public Optional<Vehiculos> buscarObjeto(Vehiculos o) {
        return Optional.empty();
    }

    @Override
    public void objetoId(int id) {

    }
}
