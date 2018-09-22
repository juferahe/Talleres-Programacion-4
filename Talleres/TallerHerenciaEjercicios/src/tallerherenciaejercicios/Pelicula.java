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
public class Pelicula extends Multimedia{
    
    private String actorPrincipal;
    private String actrizPrincipal;
    
    public Pelicula(String titulo, String autor, String formato, 
                    int duracion, String actorP) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorP;
    }
    
    /*
    // no funciona porque tiene la misma firma que el otro constructor
    
    public Pelicula(String titulo, String autor, String formato, 
                    int duracion, String actrizP) {
        super(titulo, autor, formato, duracion);
        this.actrizPrincipal = actrizP;
    }
    */

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }
    
    @Override
    public String toString()
    {   
        String resultado = "";
        
        String actorP = actorPrincipal != null ? actorPrincipal : 
                        "Desconocido";
        String actrizP = actrizPrincipal != null ? actrizPrincipal :
                        "Desconocida";
        
        resultado += super.toString() + "Actor Principal: " + actorP + "\n" +
                     "Actriz Principal: " + actrizP + "\n";
        
        return resultado;
        
        /*
        return super.toString() 
               + "Actor Principal: " + actorPrincipal + "\n"
               + "Actriz Principal: " + actrizPrincipal + "\n";
        */
        
    }
}