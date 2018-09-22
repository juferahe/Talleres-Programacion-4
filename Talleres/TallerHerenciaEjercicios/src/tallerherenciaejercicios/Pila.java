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
public class Pila implements ColeccionInterfaz {
    public Object [] arreglo;
    public int contador; // numero elementos en la pila
    public int elementos; // numero elementos maximo
    
    public Pila(int elementos)
    {
        this.arreglo = new Object [elementos];
        this.elementos = elementos;
        this.contador = 0;
    }
    
    public void setPila(int elementos)
    {
        if(arreglo != null)
        {
            arreglo = new Object [elementos];
            elementos = elementos;
            contador = 0;
        }
        
        else
        {
            System.out.println("Pila ya esta inicializada");
        }
    }
    
    @Override
    public boolean estaVacia()
    {
        // true --> esta vacia
        // false --> no esta vacia
        return contador == 0;
    }
    
    @Override
    public Object extraer()
    {
        Object objeto = null;
        // cuando hay cero elementos en el arreglo
        if (contador == 0)
        {
            System.out.println("Pila vacia");

        }
        
        // cuando hay un elemento en el arreglo (posicion 0)
        else if (contador == 1) 
        {
            objeto = arreglo[0];
            arreglo[0] = null;
            contador -= 1;
        }
        
        else
        {
            objeto = arreglo[0];
            int i;
            for(i = 1; i < contador ; i++)
            {
                arreglo[i-1] = arreglo[i];
            }
            arreglo[i-1] = null; // en el ultimo ciclo se va hasta elemento
            // si en la igualdad anterior elimino el 1, quedando arreglo[i] = null
            // el indice se desborda
            contador -= 1;

        }
            return objeto;        
    }
    
    @Override
    public Object primero()
    {
        return this.arreglo[0];
    }
    
    @Override
    public boolean aniadir(Object objeto)
    {
        boolean valorRetorno = false;
        //if ((contador + 1) == elementos)
        if (contador == elementos)
        {
            System.out.println("Pila llena. No se pueden aniadir mas objetos");
        }
        
        else if (contador == 0)
        {
            arreglo[0] = objeto;
            contador += 1;
            valorRetorno = true;
                
        }
        
        else
        {
            int i;
            for ( i = contador; i > 0; i--)
            {
                arreglo[i] = arreglo[i - 1];
            }
            arreglo[i] = objeto;
            valorRetorno = true;
            contador += 1;
            //contador  = contador <= (elementos - 1)? contador + 1 : contador;   
        }
        
        return valorRetorno;
    }
}