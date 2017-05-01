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
     * Coge los segmentos de frase de la bbdd y los concatena
     * Conecta con usuario 'Pruebas_select' y contraseña 'pruebas'
     * @return String con la frase generada
     */ 
    
    public static String generador(){
     try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.128/prueba", "Prueba_select", "pruebas");
            //Statement tiene muchos mÃ©todos, pero hay dos interesentantes: executeUpdate() y executeQuery(). 
            
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Contacto");
            while (rs.next()) {
                //System.out.println("nombre="+rs.getObject("nombre")+
                //", apellidos="+rs.getObject("apellidos")+
                //", telefono="+rs.getObject("telefono"));
                System.out.println("Nombre=" + rs.getObject("nombre")
                        + ", apellidos=" + rs.getObject("apellidos")
                        + ", ID=" + rs.getObject(1));
            }
            rs.close();            

        } catch (Exception e) {
            System.out.println("Problema con BD:" + e.getMessage());
        }
     return "";
    } 
     
    
    public static String generar(){
        String frase_montada="";    
        String[] str1,str2,str3;
        /* 
         AQUI VIENE TODO EL GENERAR Y LOS SELECT PARA PILLAR LOS SEGMENTOS DE FRASES
         */
        /**
         * str1= new String["select count(frase1) from frases;"];
         * str1[i]=("Select frase1 from frases where frase1="+i);
         * 
         * 
         * frase1=Select frase1 from frases
         * frase2=Select frase2 from frases
         * frase3=Select frase3 from frases
         * 
         */ 
        
        /**
         * for(int i =0;i<str1.length;i++){
         *     for(int j=0;j<str2.length;j++){
         *          for(int k=0;k<str3.length;k++){
         *              frase_montada=str1[i]+" "+str2[j]+" "+str2[k];
         *          }
         *     } 
         * }
         */
        
        
    return frase_montada;
    }
}
