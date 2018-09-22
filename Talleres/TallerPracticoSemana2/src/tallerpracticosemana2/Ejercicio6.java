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
public class Ejercicio6 {
    
    public String horasASemanasDias(int horas)
    {
        int h = horas % 24;
        int dias = horas / 24;
        int semanas = dias / 7;       
        dias = dias % 7;
        
        String s = "";
        
        return s + horas + " horas ---> " + semanas + " semanas, " + dias
                 + " dias, " + h + " horas\n";
    }
}
