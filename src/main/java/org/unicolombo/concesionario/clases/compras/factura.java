/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.clases.compras;

import java.time.LocalDate;
import org.unicolombo.concesionario.clases.usuario.Usuario;
import org.unicolombo.concesionario.clases.vehiculos.Vehiculos;

public class factura {
    private Usuario usuario;
    private Vehiculos vehiculo;
    private LocalDate fecha;
    private Usuario vendedor;
    
    public factura(Usuario usuario,Vehiculos vehiculo,Usuario vendedor){
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.vendedor = vendedor;
        this.fecha = LocalDate.now();
    }
}
