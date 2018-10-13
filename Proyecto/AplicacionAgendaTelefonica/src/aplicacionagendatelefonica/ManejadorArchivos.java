/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionagendatelefonica;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author Usuario 1
 */
public class ManejadorArchivos{
    private File archivo;
    private FileOutputStream fos; // se usa para escribir
    private ObjectOutputStream oos; // se usa para escribir
    private ObjectInputStream ois; // se usa para leer
    private FileInputStream fis; // se usa para leer
    
    public ManejadorArchivos()
    {
        try
        {
            //this.archivo.createNewFile();
            //this.archivo = new File("archivoserializado.txt");
            this.archivo = new File("archivoserializable.txt");
            //this.archivo.createNewFile();
            this.fis = new FileInputStream(this.archivo);
            //this.fos = new FileOutputStream(this.archivo);
            //this.oos = new ObjectOutputStream(this.fos);
            this.ois = new ObjectInputStream(this.fis);            
            
        }
        catch(IOException e)
        {
        
        }
    }
    
    public ArrayList<Contacto> cargarArchivo()
    {
        ArrayList<Contacto> agenda = new ArrayList();
        //System.out.println("Archivo existe: " + this.archivo.exists());
        if(this.archivo.length() > 0 && this.archivo.exists())
        {
           try
           {
               Contacto contacto;
                while((contacto = (Contacto)this.ois.readObject()) != null)
                {
                    agenda.add(contacto);
                }
           }
           catch(IOException | ClassNotFoundException e)
           {
           }
        }
        
        return agenda;
    }
    
    public void exportarContactos(ArrayList<Contacto> contactos)
    {
        try
        {
            File archivoExportar = new File("contactosexportados.txt");
            FileWriter fw = new FileWriter(archivoExportar);
            BufferedWriter bw = new BufferedWriter(fw);
            
            if(!contactos.isEmpty())
            {
                for(Contacto contacto: contactos)
                {
                    String registro = contacto.getNombre() + " " +
                            contacto.getApellido() + "; " +
                            contacto.getTelefonos() + "; " +
                            contacto.getCorreoElectronico() + "; " +
                            contacto.getDireccion() + "; " + 
                            contacto.getAlias();
                    bw.write(registro);
                    bw.newLine();
                }
            }
            bw.close();
        }
        catch(IOException e)
        {
        
        }
    }
    
    public void almacenarContactos(ArrayList<Contacto> contactos)
    {
        try
        {
            this.archivo.delete();
            File archivo = new File("archivoserializable.txt");
            //File archivo = new File("archivoserializado.txt");
            this.fos = new FileOutputStream(archivo);
            this.oos = new ObjectOutputStream(this.fos);
            for (Contacto contacto : contactos)
            {
            //System.out.println(c == null);
                this.oos.writeObject(contacto);
            }
            this.archivo = archivo;
            
        }
        catch(IOException e)
        {
            
        }
    }
    
    public void cerrarArchivo()
    {
        try
        {
            //this.fis.close();
            //this.fos.close();
            this.ois.close();
            this.oos.close();
        }
        catch(IOException e)
        {
                
        }
    }
    
}
