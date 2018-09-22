/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdearchivos;

// import java.io.Serializable; // se usa para definir clase srializable

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;
/**
 *
 * @author Usuario 1
 */
public class Ejercicio3 {
    /*
    * Realice una aplicacion que permita leer y escribir multiples
    * objetos serializables en un archivo
    */
    
    private File archivo;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private FileInputStream fis;
    private ObjectInputStream ois;
    
    public Ejercicio3()
    {
        try
        {
            this.archivo = new File("archivo_serializable.txt");
            this.fos = new FileOutputStream(this.archivo);
            this.fis = new FileInputStream(this.archivo);
            this.oos = new ObjectOutputStream(this.fos);
            this.ois = new ObjectInputStream(this.fis);
        }
        
        catch (FileNotFoundException e)
        {
        
        }
        catch (IOException e)
        {
        
        }
    }
    
    public void cerrarFlujosDeSalida()
    {
        try
        {
            this.fos.close();
            this.oos.close();
        }
        catch (IOException e)
        {
        
        }
    }
    
    public void escribirObjetoSerializable(Object o)
    {
        try
        {
            this.oos.writeObject(o);
        }
        catch (IOException e)
        {
        
        }
    }
    
    public void leerObjetoSerializable()
    {
        Object o;
        try
        {
            while((o = this.ois.readObject()) != null)
            {
                // estoy imprimiendo un objeto String con el proposito
                // de visualizar datos y verificar resultados, pero pueden 
                // guardarse en otra estructura o clase para darles 
                // un determinado manejo
                System.out.println(o.toString());
            }
            
            // por ahora cierro los flujos de entrada aqui
            // pero no he considerado si es el mejor lugar para cerrarlos
            this.fis.close();
            this.ois.close(); 
        }
        
        catch (IOException e)
        {
        
        }
        
        catch (ClassNotFoundException e)
        {
        
        }
    }
    
}
