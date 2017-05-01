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
public class AñadirFrases {
    
    private String seg1; 
    private String seg2;
    private String seg3;

    public AñadirFrases() {
    }

    public AñadirFrases(String seg1, String seg2, String seg3) {
        this.seg1 = seg1;
        this.seg2 = seg2;
        this.seg3 = seg3;
    }

    public void setSeg1(String seg1) {
        this.seg1 = seg1;
    }

    public void setSeg2(String seg2) {
        this.seg2 = seg2;
    }

    public void setSeg3(String seg3) {
        this.seg3 = seg3;
    }
    
    /**
     * Añade segmentos a la bbdd para poder usar en generar
     */
    public static void anadir(){
    
        /* 
            AQUI VIENE TODA LA PARTE DE AÑADIR FILAS A LA BBDD
        */
        
    }
    
}
