/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigopruebaarchivoslibroprogjava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario 1
 */
public class PruebaCreacionArchivosSecuenciales {
    void ejecutarCodigoPrueba()
    {
        try
        {
            File archivo = new File("archivo.txt");
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 1; i <= 10; i++)
            {
                bw.write("Estructura del Archivo # " + i);
                bw.newLine();
            }
            bw.close();
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
