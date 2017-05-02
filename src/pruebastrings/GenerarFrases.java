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
public class GenerarFrases {

    private String frase1;
    private String frase2;
    private String frase3;

    public GenerarFrases() {
    }

    public GenerarFrases(String frase1, String frase2, String frase3) {
        this.frase1 = frase1;
        this.frase2 = frase2;
        this.frase3 = frase3;
    }

    public String getFrase1() {
        return frase1;
    }

    public String getFrase2() {
        return frase2;
    }

    public String getFrase3() {
        return frase3;
    }

    /**
     * Coge los segmentos de frase de la bbdd y los concatena Conecta con
     * usuario 'Pruebas_select' y contraseña 'pruebas'
     *
     * @return String con la frase generada
     */
    
        
     
    

    public static String generar() {
        String frase_montada = "";
        ArrayList<String> ar = new ArrayList<String>();
        ArrayList<String> ar1 = new ArrayList<String>();
        ArrayList<String> ar2 = new ArrayList<String>();
        
        /* 
         AQUI VIENE TODO EL GENERAR Y LOS SELECT PARA PILLAR LOS SEGMENTOS DE FRASES
         */
        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "Pruebas_select", "pruebas");
            //Statement tiene muchos mÃ©todos, pero hay dos interesentantes: executeUpdate() y executeQuery(). 

            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM frases");
               
            while (rs.next()) {
                //System.out.println("nombre="+rs.getObject("nombre")+
                //", apellidos="+rs.getObject("apellidos")+
                //", telefono="+rs.getObject("telefono"));
                ar.add((String) rs.getObject("frase1"));
                ar1.add((String) rs.getObject("frase2"));
                ar2.add((String) rs.getObject("frase3"));
            }
                
            rs.close();

        } catch (Exception e) {
            System.out.println("Problema con BD:" + e.getMessage());
        }

        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j < ar1.size(); j++) {
                for (int k = 0; k < ar2.size(); k++) {
                    frase_montada = ar.get(i) + " " + ar1.get(j) + " " + ar2.get(k);
                    System.out.println(frase_montada);
                }
            }
        }

        return frase_montada;
    }
}
