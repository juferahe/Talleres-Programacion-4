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
public class Ejercicio5 {
    @SuppressWarnings("empty-statement")
    public boolean esPrimo(int numero)
    {
        boolean respuesta;
        if (numero > 1)
        {
            int divisor = 1;
            int divisores = 0;
            for(; divisores <= 2 && divisor <= numero; divisor++)
            {
                if((numero % divisor) == 0)
                {
                    divisores += 1;
                }
            }
            System.out.println(divisores);
            respuesta = divisores == 2;
        }
        else
        {
            respuesta = false;
        }
        
        return respuesta;
    }
}
