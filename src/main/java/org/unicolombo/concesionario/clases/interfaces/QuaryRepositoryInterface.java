/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.clases.interfaces;

/**
 *
 * @author Usuario
 */
public interface QuaryRepositoryInterface<T> {
    
     public T buscarObjeto(T o);
     
     public void objetoId(int id);
}
