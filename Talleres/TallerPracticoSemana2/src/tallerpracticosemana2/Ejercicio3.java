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
public class Ejercicio3 {
    //fibonacci recursivo
    
    // basado en esta secuencia
    // http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
    public int fibonacci(int numero)
    {
        if (numero == 0)
        {
            return 0;
        }
        else if (numero == 1 || numero == 2)
        {
            return 1;
        }
        
        else
        {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }    
}
