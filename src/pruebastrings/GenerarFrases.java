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
    
    /**
     * try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "mysql");
            //Statement tiene muchos mÃ©todos, pero hay dos interesentantes: executeUpdate() y executeQuery(). 
            //El primero se usa para sentencias SQL que impliquen modificaciones en la base de datos (INSERT, UPDATE, DELETE, etc). 
            //El segundo sÃ³lo para consultas (SELECT y similares).
            Statement st = conexion.createStatement();
            //st.executeUpdate("CREATE TABLE Contacto (id INT AUTO_INCREMENT, PRIMARY KEY(id), nombre VARCHAR(20), apellidos VARCHAR(20), telefono VARCHAR(20))");
            //st.executeUpdate("INSERT INTO Contacto (USUARIO, LONGITUD, LATITUD, TIEMPO) VALUES ('"+nombres[i]+"','"+apellidos[i]+"','"+telefonos[i]+"' )");
            //st.executeUpdate("INSERT INTO Contacto (USUARIO, LONGITUD, LATITUD, TIEMPO) VALUES ('Pepe',32, 23, 5)");
            //String nombres[]={"Juan","Pedro","Antonio"};
            //String apellidos[]={"Gomez","Lopez","Alvarez"};
            //String telefonos[]={"123","456","789"};
            //for (int i=0;i<nombres.length;i++)
            //st.executeUpdate("INSERT INTO contacto2 (nombre, apellidos, telefono) VALUES ('"+nombres[i]+"','"+apellidos[i]+"','"+telefonos[i]+"' )");
            //El insert mÃ¡s claro:
            st.executeUpdate("INSERT INTO Contacto (nombre, apellidos, telefono) VALUES ('jkfdsahfhdlsa', 'López17', '131317')");
            st.executeUpdate("INSERT INTO Contacto (nombre, apellidos, telefono) VALUES ('Jesus', 'Vela17', '616117')");
            ResultSet rs = st.executeQuery("SELECT * FROM Contacto");
            ResultSet rar=null;
            while (rs.next()) {
                //System.out.println("nombre="+rs.getObject("nombre")+
                //", apellidos="+rs.getObject("apellidos")+
                //", telefono="+rs.getObject("telefono"));
                System.out.println("Nombre=" + rs.getObject("nombre")
                        + ", apellidos=" + rs.getObject("apellidos")
                        + ", ID=" + rs.getObject(1));
            }
            rs.close();            
            
            rar = st.executeQuery("SELECT * FROM Contacto where nombre='Pepe17'");
            while (rar.next()) {
                System.out.println("Nombre=" + rar.getObject("nombre"));
            }
            
            //-----***Consulta propia en ofitarde***----------
//            while (rar.next()) {
//                System.out.println("Nombre=" + rar.getObject("nombre")+ ", Codigo "+
//                        rar.getObject("Codigo"));
//            }
//            rar.close();

//            //Crear la tabla para circulos:
//            st.executeUpdate("CREATE TABLE circulos (id INT AUTO_INCREMENT, PRIMARY KEY(id), radio VARCHAR(9), x VARCHAR(9), y VARCHAR(9), tiempo VARCHAR (15), tipo VARCHAR(1)");
//            String radios[]={"1","2","3"};
//            String x[]={"10","20","30"};
//            String y[]={"50","60","70"};
//            String tiempo[]={"123","456","789"};
//            String tipos[]={"3","3","3"};
// ResultSet rs = st.executeQuery("SELECT * FROM T_Circulos"); 
//            while (rs.next())
//            {
//                //System.out.println("nombre="+rs.getObject("nombre")+
//                //", apellidos="+rs.getObject("apellidos")+
//                //", telefono="+rs.getObject("telefono"));
//                System.out.println("Radio="+rs.getObject("Radio")+
//                ", tipo="+rs.getObject("Tipo")+
//                ", ID="+rs.getObject(1));
//            }
//            rs.close();
        } catch (Exception e) {
            System.out.println("Problema con BD:" + e.getMessage());
        }
     * 
     * 
     *  
     */
    
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
