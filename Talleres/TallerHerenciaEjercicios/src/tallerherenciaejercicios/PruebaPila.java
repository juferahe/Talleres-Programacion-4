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
public class PruebaPila {
    
    public void rellenar(ColeccionInterfaz pila)
    {
            for (int i = 1; i <= ((Pila)pila).elementos; i++)
        {
            //System.out.print(pila.primero() + " ");

            pila.aniadir(i);
        }
    }
    
    
    
    public void imprimiryVaciar(ColeccionInterfaz pila)
    {
        while(!pila.estaVacia())
        {
            //System.out.print(((Pila)pila).contador);
            Object o = pila.extraer();
            System.out.print(o + " ");
        }
        System.out.println();
    }
}