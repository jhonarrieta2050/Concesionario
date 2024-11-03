/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.utilidades;

/**
 *
 * @author Alexander Samuel
 */
public class ControladorValidacion {
    public boolean validarEmail(String email) {
        // Expresión regular básica para validar un email
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[a-zA-Z]{2,4}$";
        return email.matches(regex);
    }
}
