/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.util.Observable;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Usuario 1
 */
public class Juego extends Observable{
    private static final int DERECHA = 1;
    private static final int IZQUIERDA = 2; 
    private static final int ARRIBA = 3;
    private static final int ABAJO = 4;
    private ArrayList<Ficha> tablero;
    private int[] representacionIntTablero;
    private Jugador jugador;
    private Ficha seleccion1;
    private Ficha seleccion2;
    private int contadorSeleccion;
    
    public Juego()
    {   
        this.tablero = new ArrayList<>();
        this.jugador = new Jugador(1,1);
        this.representacionIntTablero = new int[16];
        this.contadorSeleccion = 0;
        cargarFichas();
    }
    
    private void cargarFichas()
    {        
        generarTablero();
        int size = this.representacionIntTablero.length;
        int posx;
        int posy;
        int numero;
        Ficha ficha;
        String nombre;
        
        for(int i = 0; i < size; i++)
        {
            System.out.print(this.representacionIntTablero[i] + " ");
        }
        System.out.println("");
        
        for(int i = 0; i < size; i++)
        {
            //posx = (i / 4) + 1;
            //posy = (i % 4) + 1;
            posx = (i % 4) + 1;
            posy = (i / 4) + 1;
            numero = this.representacionIntTablero[i];
            nombre = numero == 16 ? "blanco" : Integer.toString(numero);
            nombre += ".png";
            ficha = new Ficha(posx, posy, nombre, numero);
            this.tablero.add(ficha);
            //System.out.println("Nombre: " + nombre + " pos_x: " + posx + 
            //        " pos_y: " + posy);
        }
    }
    
    private void generarTablero()
    {
        int minimo = 0;
        int maximo = 15;
        int aleatorio;
        int size = this.representacionIntTablero.length;
        Random r = new Random();        
        for(int i = 0; i < size; i++)
        {
            //int aleatorio = (int) Math.floor( Math.random() * 
            //        (minimo - ( maximo + 1)) + (maximo) ) ;
            //int aleatorio = (int) Math.floor( Math.random() * 
            //        (maximo - minimo + 1) + minimo );
            //int aleatorio = (int)(Math.floor(Math.random() * 16));
            aleatorio = r.nextInt(16) + 1;
            while(esta(aleatorio))
            {
                //aleatorio = (int) Math.floor( Math.random() * 
                //    (minimo - ( maximo + 1)) + (maximo) ) ;
                //aleatorio = (int) Math.floor( Math.random() * 
                //    (maximo - minimo + 1) + minimo );
                aleatorio = r.nextInt(16) + 1;
            }
            this.representacionIntTablero[i] = aleatorio;
        }
    }
        
    private boolean esta(int numero)
    {
        int lenght = this.representacionIntTablero.length;
        for(int i = 0; i < lenght; i++)
        {
            if(numero == this.representacionIntTablero[i])
            {
                return true;
            }
        }
        return false;
    }
    ///
    // getters

    public ArrayList<Ficha> getTablero() {
        return tablero;
    }

    public int[] getRepresentacionIntTablero() {
        return representacionIntTablero;
    }
    
    public Jugador getJugador()
    {
        return jugador;
    }
    
    public void izquierda()
    {
        if(!colisionBorde(Juego.IZQUIERDA))
        {
            jugador.izquierda();
        }
        notificar();
    }
    
    public void derecha()
    {
        if(!colisionBorde(Juego.DERECHA))
        {
            jugador.derecha();
        }
        notificar();
    }
    
    public void arriba()
    {
        if(!colisionBorde(Juego.ARRIBA))
        {
            jugador.arriba();
        }
        notificar();
    }
    
    public void abajo()
    {
        if(!colisionBorde(Juego.ABAJO))
        {
            jugador.abajo();
        }
        notificar();
    }
/*    
    public void seleccionar()
    {
        if(contadorSeleccion < 2)
        {
            if(contadorSeleccion == 0)
            {
                seleccion1 = buscarFicha();
                contadorSeleccion += 1;

            }
            
            else
            {
                seleccion2 = buscarFicha();
                contadorSeleccion += 1;
                this.colisionEspacioEnBlanco();
                seleccion1 = null;
                seleccion2 = null;
                contadorSeleccion = 0;
            }
        }
    }
*/
    public void seleccionar()
    {

        if(contadorSeleccion == 0)
        {
            seleccion1 = buscarFicha();
            contadorSeleccion += 1;
        }
            
        else
        {
            seleccion2 = buscarFicha();
            if(colisionEspacioEnBlanco())
            {
                swap();
                notificar();
            }
            seleccion1 = null;
            seleccion2 = null;
            contadorSeleccion = 0;
        }
    }
    private Ficha buscarFicha()
    {
        int x = jugador.getX();
        int y = jugador.getY();
        //Ficha retorno = null;
        for(Ficha ficha: this.tablero)
        {
            if(x == ficha.getX() && y == ficha.getY())
            {
                //retorno = ficha;
                //break;
                return ficha;
            }
        }
        
        //return retorno;
        return null;
    }
    
    
    
    private boolean colisionBorde(int direccion)
    {
        int x = this.jugador.getX();
        int y = this.jugador.getY();
        
        if ( (direccion == Juego.ARRIBA && y == 1) ||
             (direccion == Juego.ABAJO && y == 4) ||
             (direccion == Juego.IZQUIERDA && x == 1) ||
             (direccion == Juego.DERECHA && x == 4) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
/*   
    // funcion detectar colision v1
    private void colisionEspacioEnBlanco()
    {
        if(seleccion1.getRepresentacion() == 16 || seleccion2.getRepresentacion() == 16)
        {
            if(seleccion1.getX() == seleccion2.getX())
            {
                int y1 = seleccion1.getY();
                int y2 = seleccion2.getY();
                
                if((y1 +1) == y2 )
                {
                    swap();
                    notificar();
                }
                
                else if ((y1 - 1) == y2)
                {
                    swap();
                    notificar();
                }
            }
            
            else if (seleccion1.getY() == seleccion2.getY())
            {
                int x1 = seleccion1.getX();
                int x2 = seleccion2.getX();
                
                if ((x1 + 1) == x2)
                {
                    swap();
                    notificar();
                }
                
                else if ((x1 - 1) == x2)
                {
                    swap();
                    notificar();
                }
            }
        }
    }
*/    
    // funcion detectar colision v2
    private boolean colisionEspacioEnBlanco()
    {
        if(seleccion1.getRepresentacion() == 16 || seleccion2.getRepresentacion() == 16)
        {
            int y1 = seleccion1.getY();
            int y2 = seleccion2.getY();
            int x1 = seleccion1.getX();
            int x2 = seleccion2.getX();            
                
            if ( ( (x1 == x2) && ( ((y1 + 1) == y2) || ((y1 - 1) == y2) ) ) ||
                ( (y1 == y2) && ( ((x1 + 1) == x2) || ((x1 - 1) == x2) ) ) )
            {
                return true;
            }
        }
        System.out.println("Dos piezas que no son espacio en blanco o dos "
                + "espacios en blanco");
        return false;
    }

   
    private void swap()
    {
        //int posicion1 = this.tablero.indexOf(seleccion1);
        //int posicion2 = this.tablero.indexOf(seleccion2);
        int x1 = seleccion1.getX();
        int y1 = seleccion1.getY();
        int x2 = seleccion2.getX();
        int y2 = seleccion2.getY();
        //int posicion1 = ((x1 - 1) * 4) + (y1 - 1);
        //int posicion2 = ((x2 - 1) * 4) + (y2 - 1);
        int posicion1 = ((y1 - 1) * 4) + (x1 - 1);
        int posicion2 = ((y2 - 1) * 4) + (x2 - 1);
        seleccion1.setX(x2);
        seleccion1.setY(y2);
        seleccion2.setX(x1);
        seleccion2.setY(y1);
        int elemento1 = this.representacionIntTablero[posicion1];
        int elemento2 = this.representacionIntTablero[posicion2];
        this.representacionIntTablero[posicion1] = elemento2;
        this.representacionIntTablero[posicion2] = elemento1;
        
        for(int i = 0; i < 16; i++)
        {
            System.out.print(representacionIntTablero[i] + " ");
        }
        System.out.println("");
        
    }
    
    // observable
    public void notificar()
    {
        this.setChanged();
        this.notifyObservers(this);
    }
}
