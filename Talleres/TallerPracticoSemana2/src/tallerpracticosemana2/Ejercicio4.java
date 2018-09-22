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
public class Ejercicio4 {
    public int potencia(int n, int m)
    {
        int resultado;
        if (m > 1)
        {
            for(resultado = 0; m > 0; m--)
            {
                resultado += n;
            }
        }
        else if (m == 1)
        {
            resultado = n;
        }
        else
        {
            resultado = 1;
        }
        
        return resultado;
    }
}
