/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.unicolombo.concesionario.negocio.Interface.Repositorios.Comandos;

/**
 *
 * @author Usuario
 */
public interface ComandosBasicosInterface<T> {
    
    public void guardar(T o);
    
    public void editar(T o);
    
   
}
