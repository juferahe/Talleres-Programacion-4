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
public class Ejercicio2 {
    // factorial
    
    public int factorial( int numero )
    {
        int resultado;
        
        if ( numero > 0 )
        {
            
            for( resultado = 1; numero > 0; numero-- )
            {
                resultado *= numero;
            }
        }
        
        else
        {
            resultado = 1;
        }
        
        return resultado;
    }
}
