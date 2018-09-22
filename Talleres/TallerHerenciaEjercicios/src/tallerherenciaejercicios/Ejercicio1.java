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
public class Ejercicio1 {
    
    
    public void ejecutar()
    {
        ListaMultimedia lista1 = new ListaMultimedia(10);
        Pelicula pelicula1 = new Pelicula("Algun Titulo","Algun Tipo",
                             "mp4",155, "Un tipo 2");
        Pelicula pelicula2 = new Pelicula("Algun Titulo 2","Algun Tipo 3",
                             "dvd",210, "Un tipo 4");
        Pelicula pelicula3 = new Pelicula("Algun Titulo","Algun Tipo 5",
                             "bluray",180, "Un tipo 6");

        lista1.add(pelicula1);
        lista1.add(pelicula2);
        lista1.add(pelicula3);
        
        System.out.println(lista1.toString());
        
        
        ListaMultimedia lista2 = new ListaMultimedia(20);
        
        Disco disco1 = new Disco("Un album 1", "algun tipo 1", "cdAudio", 
                      55, "pop");
        Disco disco2  = new Disco("Un album 2", "algun tipo 2", "cdAudio", 
                      46, "jazz");
        Disco disco3 = new Disco("Un album 3", "algun tipo 3", "cdAudio", 
                      38, "blues");
        
        lista2.add(disco1);
        lista2.add(disco2);
        lista2.add(disco3);
        
        System.out.println(lista2.toString());
    }
}
