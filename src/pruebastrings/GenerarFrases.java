/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebastrings;

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
    
    public static String generar(){
        
        /* 
         AQUI VIENE TODO EL GENERAR Y LOS SELECT PARA PILLAR LOS SEGMENTOS DE FRASES
         */
        
    return "";
    }
}
