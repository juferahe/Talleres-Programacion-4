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
public class ListaMultimedia {
    private Multimedia [] lista;
    private int limiteAlmacenamiento;
    private int capacidadActual = 0;
    
    public ListaMultimedia(int limiteAlmacenamiento)
    {
        this.limiteAlmacenamiento = limiteAlmacenamiento;
        lista = new Multimedia[this.limiteAlmacenamiento];
    }
    
    public int size()
    {
        return capacidadActual;
    }
    
    public boolean add(Multimedia objeto)
    {
        boolean respuesta = false;
        if(capacidadActual < limiteAlmacenamiento)
        {
            lista[capacidadActual] = objeto;
            capacidadActual += 1;
            respuesta = true;
        }
        else
        {
            System.out.println("Lista llena. "
                    + "No se pueden Almacenar mas Informacion");
        }
        return respuesta;
    }
    
    public Multimedia get(int posicion)
    {
        return lista[posicion];
    }
    
    @Override
    public String toString()
    {
        String resultado = "";
        /*
        // ¿este for-each produce error si trato de iterar
        // sobre un arreglo no lleno del todo?
        for(Multimedia elemento: this.lista)
        {
            System.out.println(elemento.toString());
            resultado += elemento.toString();
        }
        */
        
        for( int i = 0; i < capacidadActual;i++)
        {
            resultado += lista[i].toString() + "\n";
        }
        
        return resultado;
        
    }
}