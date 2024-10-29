/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.unicolombo.concesionario.clases.interfaces;

/**
 *
 * @author Usuario
 */
public interface ComandRepositoryInterface<T> {
    
    public void guardar(T o);
    
    public void editar(T o);
    
   
}
