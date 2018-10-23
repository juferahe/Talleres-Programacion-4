/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopuzzle4x4;

import visualizacion.*;

/*

1. Implemente una aplicación utilizando el patrón MVC
que emule el juego “puzzle”. Este juego consiste en
una cuadricula de 4 filas y cuatro columnas, lo que 
implica tener 16 celdas. Las 15 primeras celdas 
contienen imágenes que, en el orden correcto, conforman
una imagen total. El juego debe entregar las imágenes de
las celdas en desorden con el fin de ser ordenadas
por el usuario: El juego debe contener al menos
los siguientes elementos:

a. Modelo. Se debe conformar por una clase Juego y
una clase Ficha. La clase Ficha debe tener la posición
en el eje X y Y, además de la imagen. La clase Juego
debe heredar de Observable.

b. Vista. Debe tener un JPanel que permita visualizar
el estado del juego. Debe implementar la interfaz
Observer.

c. Controlador. Debe tener un JPanel con botones para
que el usuario pueda cambiar el estado del modelo.

*/

/**
 *
 * @author Usuario 1
 */
public class JuegoPuzzle4x4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
    
}
