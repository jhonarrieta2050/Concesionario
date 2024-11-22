/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.unicolombo.concesionario.Infraestructura.Persistencia.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObtenerConexion {
    
    public static final String USER = "root";
    public static final String PASSWORD = "123456789";
    public static final String URL = "jdbc:mysql://localhost:3306/concesionario?serverTimeZone=America/Bogota";
    
    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
