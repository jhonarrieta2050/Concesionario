/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.clases.facturas.modelo;

import java.time.LocalDate;
import org.unicolombo.concesionario.clases.usuario.modelo.Usuario;
import org.unicolombo.concesionario.clases.vehiculo.modelo.Vehiculos;

public class factura {
    private Usuario usuario;
    private Vehiculos vehiculo;
    private LocalDate fecha;
    private String vendedor;
    
    public factura(Usuario usuario,Vehiculos vehiculo,String vendedor){
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.vendedor = vendedor;
        this.fecha = LocalDate.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

   
    
    
}
