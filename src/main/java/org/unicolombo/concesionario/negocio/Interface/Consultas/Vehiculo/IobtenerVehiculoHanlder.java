package org.unicolombo.concesionario.negocio.Interface.Consultas.Vehiculo;

import org.unicolombo.concesionario.Dominio.Modelos.Vehiculos;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Usuarios.IcrearUsuarioService;
import org.unicolombo.concesionario.negocio.Interface.CasosUso.Vehiculo.IobtenerVehiculoService;

import java.util.HashSet;

public interface IobtenerVehiculoHanlder {
    public HashSet<Vehiculos> obtenerVehiculosHanlder();
}
