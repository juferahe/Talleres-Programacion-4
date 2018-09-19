/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigopruebaarchivoslibroprogjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Usuario 1
 */
public class PruebaLecturaArchivosSecuenciales {
    
    public void ejecutarCodigoPrueba()
    {
        try
        {
            File archivo = new File("archivo.txt");
            FileReader fr = new FileReader(archivo);            
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            
            while((cadena = br.readLine()) != null)
            {
                System.out.println(cadena);
            }
            
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
