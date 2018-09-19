/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigopruebaarchivoslibroprogjava;

/**
 *
 * @author Usuario 1
 */
public class CodigoPruebaArchivosLibroProgJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Prueba1 prueba1 = new Prueba1();
        prueba1.ejecutarCodigoPrueba();
        
        PruebaCreacionArchivosSecuenciales prueba2 = new
            PruebaCreacionArchivosSecuenciales();
        prueba2.ejecutarCodigoPrueba();
        
        PruebaLecturaArchivosSecuenciales prueba3 = new
            PruebaLecturaArchivosSecuenciales();
        prueba3.ejecutarCodigoPrueba();
    }
    
}
