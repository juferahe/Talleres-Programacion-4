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
public class TallerPracticoSemana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 
         * tambien se pudo haber tomado cada uno de esos metodos y meterlos
         * a una unica clase
        */
        
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.parOImpar(15);
        System.out.println(ejercicio1.esPar(15));
        
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int n = 10;
        System.out.println("Factorial de " + n + " es " + ejercicio2.factorial(n));
        
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int m = 10;
        System.out.println("El fibonacci de " + m + " es " + ejercicio3.fibonacci(m));
        
        Ejercicio4 ejercicio4 = new Ejercicio4();
        int o = 4;
        int p = 6;
        System.out.println("El resultado de hacer n^m con "
                + " n = " + o + " m = " + p + " es " + ejercicio4.potencia(o, p));
        
        Ejercicio5 ejercicio5 = new Ejercicio5();
        int r = 13;
        System.out.println(r + " es primo? " + ejercicio5.esPrimo(r));
        
        Ejercicio6 ejercicio6 = new Ejercicio6();
        int horas = 500;
        System.out.println(ejercicio6.horasASemanasDias(horas));  
        
        Ejercicio7 ejercicio7 = new Ejercicio7();
        double a = 10;
        double b = 5;
        double c = -2;
        ejercicio7.calcularRaicesEc2doGrado(a, b, c);
        
        System.out.println("");
    }
    
}
