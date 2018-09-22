/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdearchivos;

/**
 *
 * @author Usuario 1
 */
public class EjerciciosDeArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Ejercicio 1 - El archivo ya fue creado */
        //Ejercicio1 ejercicio1 = new Ejercicio1();
       // ejercicio1.ejecutarCodigo();
       
       /* Ejercicio 2 */
       Ejercicio2 ejercicio2 = new Ejercicio2();
       ejercicio2.ejecutarCodigo();
       
       // verificacion resultados ejercicio 2
       System.out.println("Numero Datos: " + ejercicio2.getNumeroDatos());
       System.out.println("Suma: " + ejercicio2.getSuma());
       System.out.println("Promedio: " + ejercicio2.getPromedio());
       
       
      /* Ejercicio 3 */
      Ejercicio3 ejercicio3 = new Ejercicio3();
      
      // Clase Persona tomada del libro 
      // "Programacion Orientada a Objetos Usando Java" 
      // de Hector Arturo Florez Fernandez, Ediciones Ecoe
      Persona persona1 = new Persona(1, "Juan", "Perez", "jperez@dominio.com");
      Persona persona2 = new Persona(2, "Maria", "Lopez", "mlopez@dominio.com");
      Persona persona3 = new Persona(3, "Luis", "Rodriguez",
              "luisr@dominio.com");
      ejercicio3.escribirObjetoSerializable(persona1);
      ejercicio3.escribirObjetoSerializable(persona2);
      ejercicio3.escribirObjetoSerializable(persona3);
      
      ejercicio3.cerrarFlujosDeSalida();
      
      ejercicio3.leerObjetoSerializable();
    }
    
}
