/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerherenciaejercicios;

/**
 *
 * @author Usuario 1
 */
public class Ejercicio2 {
    public void ejecutar()
    {
        // cuando se instancian subclases usando referencias de la superclase
        // la clase instanciada solo puede usar metodods de la superclase
        // a traves de esa referencia a la superclase en la que esta 
        // almacenado
        PruebaPila prueba1 = new PruebaPila();
        //ColeccionInterfaz pila1 = new Pila(10);
        Pila pila1 = new Pila(10);
        //System.out.println(pila1.extraer());
        //System.out.println(pila1.elementos + " " + pila1.contador);       
        prueba1.rellenar(pila1);
        //System.out.println(pila1.elementos + " " + pila1.contador);  
        //System.out.println(pila1.primero());  
        prueba1.imprimiryVaciar(pila1);   
    }
}
