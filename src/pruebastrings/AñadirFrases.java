/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebastrings;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class AñadirFrases {
    
    
    
    
    public AñadirFrases() {
        
    }

    
    
    
    
    /**
     * Añade segmentos a la bbdd para poder usar en generar
     * Conecta con usuario 'Pruebas_Insert' y contraseña 'pruebas'
     */
    public static void anadir(String seg1,String seg2,String seg3){
    
        /* 
            AQUI VIENE TODA LA PARTE DE AÑADIR FILAS A LA BBDD
        */
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "Pruebas_insert", "pruebas");
            //Statement tiene muchos mÃ©todos, pero hay dos interesentantes: executeUpdate() y executeQuery(). 

            Statement st = conexion.createStatement();
            
            
            st.executeUpdate("INSERT INTO frases (frase1,frase2,frase3) VALUES ("+seg1+","+seg2+","+seg3+");");
            
           
                
            

        } catch (Exception e) {
            System.out.println("Problema con BD:" + e.getMessage());
        }
        
    }
    
}
