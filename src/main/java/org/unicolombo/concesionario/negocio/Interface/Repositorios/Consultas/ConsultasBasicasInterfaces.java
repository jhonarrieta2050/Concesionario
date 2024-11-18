/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.negocio.Interface.Repositorios.Consultas;

import java.util.Optional;

/**
 *
 * @author Usuario
 */
public interface ConsultasBasicasInterfaces<T> {
    
     public Optional<T> buscarObjeto(T o);
     
     public void objetoId(int id);
}
