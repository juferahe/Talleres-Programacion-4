/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerherenciaejercicios;

/**
 *
 * @author Usuario 1
 */
public class Disco extends Multimedia{
    
    private String genero;
    
    public Disco(String titulo, String autor, String formato, 
                      int duracion, String genero)
    {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    
    @Override
    public String toString()
    {
        String resultado = "" + super.toString() + "Genero: " + 
                this.genero + "\n";
        return resultado;
        
        /*
                return  super.toString() + "Genero: " + 
                this.genero + "\n";
        
        */
    }
}