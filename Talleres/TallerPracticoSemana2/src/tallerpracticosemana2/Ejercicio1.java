/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpracticosemana2;

/**
 *
 * @author Usuario 1
 */
public class Ejercicio1 {
    public boolean esPar(int numero)
    {
        return ((numero % 2) == 0);
    }
    
    public void parOImpar(int numero)
    {
        if ((numero % 2) == 0)
        {
            System.out.println("El numero " + numero + " es par");
        }
        else
        {
            System.out.println("El numero " + numero + " es impar");
        }
    }
}
