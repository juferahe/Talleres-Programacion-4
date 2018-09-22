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
public class Multimedia {
    //public static String formatosValidos = {};
    private String titulo;
    private String autor;
    private String formato;
    private int duracion;
    
    public Multimedia(String titulo, String autor, String formato, 
                      int duracion)
    {
        // falta validar los generos de modo que de acuerdo al tipo de
        // objeto (disco, pelicula) solo se permita asociar los tipos
        // de formato correspondientes
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this. duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public boolean equals(Multimedia objeto)
    {
        return (titulo.equals(objeto.titulo) && 
                autor.equals(objeto.autor));
    }
    
    
    @Override
    public String toString()
    {
        return "Archivo Multimedia \n"
                + "Titulo: " + titulo + "\n"
                + "Formato: " + formato + "\n"
                + "Autor: " + autor + "\n"
                + "Duracion: " + duracion + " minutos" + "\n";
    }
}