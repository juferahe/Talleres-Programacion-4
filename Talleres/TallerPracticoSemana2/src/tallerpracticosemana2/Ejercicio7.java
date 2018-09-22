/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpracticosemana2;
import static java.lang.Math.*;
/**
 *
 * @author Usuario 1
 */
public class Ejercicio7 {
    public void calcularRaicesEc2doGrado( double a, double b, double c )
    {
        double calc = 4 * a * c;
        double squaredB = b * b;
        
        if ( calc > b )
        {
            System.out.println("La ecuacion no tiene raiz real");
        }
        
        else
        {
            double x1 = ( -b + sqrt( squaredB - calc ) ) / ( 2 * a );
            double x2 = ( -b - sqrt( squaredB - calc ) ) / ( 2 * a );
            
            System.out.println( "Raiz x1 = " + x1 );
            System.out.println( "Raix x2 = " + x2 );
        }
    }
}
