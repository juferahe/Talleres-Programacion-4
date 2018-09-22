/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdearchivos;

import java.util.Scanner;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Usuario 1
 */
public class Ejercicio1 {
    
    /*
    * Ejercicio 1
    * Realice una aplicacion que permita capturar 10 numeros por entrada
    * estandar y los almacene en un archivo de texto plano
    */
    
    private File archivo;
    private BufferedWriter bw;
    private FileWriter fw;
    private Scanner sc;
    
    public Ejercicio1()
    {
        try
        {
            this.archivo = new File("ejercicio1.txt");
            this.fw = new FileWriter(this.archivo);
            this.bw = new BufferedWriter(this.fw);
            this.sc = new Scanner(System.in);
        }
        catch(IOException e)
        {
        
        }
    }
    
    public void ejecutarCodigo()
    {
        try{
            int numero;
            System.out.println("Introduzca 10 numeros por teclado");
            for(int i = 1; i <= 10; i++)
            {
                System.out.print("Numero # " + i + " : ");
                numero = this.sc.nextInt();
                this.bw.write(Integer.toString(numero) + " ");
                
                /*
                * si escribo
                * this.bw.write(numero);
                * el contenido del archivo es ilegible
                */
            }
            this.fw.close();
            this.bw.close();
        }
        
        catch (IOException e)
        {
                
        }
       
    }
}
