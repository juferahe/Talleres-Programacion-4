/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdearchivos;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author Usuario 1
 */
public class Ejercicio2 {
    /*
    * Ejercicio 2
    *
    * Realice una aplicacion que contenga numeros y calcule el promedio
    * de dichos numero
    */
    private File archivo;
    private FileReader fr;
    private BufferedReader br;
    private int suma;
    private int promedio;
    private int numeroDatos;
    
    public Ejercicio2()
    {
        try
        {
            this.archivo = new File("ejercicio1.txt");
            this.fr = new FileReader(this.archivo);
            this.br = new BufferedReader(this.fr);
            this.suma = 0;
            this.promedio = 0;
            this.numeroDatos = 0;
        }
        catch (IOException e)
        {
        
        }
        
    }
    
    public void ejecutarCodigo()
    {
        try
        {
            String cadena;
            String [] partes;
            while((cadena = this.br.readLine()) != null)
            {               
                partes = cadena.split(" ");
                
                for(String a : partes)
                {
                    int numero = Integer.parseInt(a);
                    this.suma += numero;
                    this.numeroDatos += 1;
                }
                /*
                for(int i = 0; i < partes.length; i++)
                {
                    int numero = Integer.parseInt(partes[i]);
                    this.suma += numero;
                    this.numeroDatos += 1;
                }
                */
            }
            this.promedio = this.suma / this.numeroDatos;
            
            this.fr.close();
            this.br.close();
        }
        catch (IOException e)
        {
        
        }
    }
    
    public int getPromedio()
    {
        return this.promedio;
    }
    
    public int getNumeroDatos()
    {
        return this.numeroDatos;
    }
    
    public int getSuma()
    {
        return this.suma;
    }
}
