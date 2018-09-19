/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigopruebaarchivoslibroprogjava;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Usuario 1
 */
public class Prueba1 {
    
    void ejecutarCodigoPrueba()
    {
        File archivo = new File("archivo.txt");
        System.out.println("El nombre del archivo es: " + archivo.getName());
        System.out.println("La ruta absoluta del archivo es:"
                + archivo.getAbsolutePath());
        try
        {
            if(archivo.createNewFile())
            {
                System.out.println("El archivo fue creado");
            }
            else
            {
                System.out.println("El archivo NO fue creado");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Es directorio? " + archivo.isDirectory());
        System.out.println("Es archivo? " + archivo.isFile());
        System.out.println("Fecha de modificacion: " + archivo.lastModified());
        Date fecha = new Date(archivo.lastModified());
        System.out.println("Fecha de modificacion: " + fecha.toString());
        System.out.println("Tamaño: " + archivo.length());
    }
    /* 
    * No puedo hacer esto
    * No puedo enviar nada al fludo de salida estandar fuera de un metodo
    * Por lo tanto, la siguiente instruccion es ilegal y genera error
    */
    // System.out.println("El nombre del archivo es: " + archivo.getName());
}
