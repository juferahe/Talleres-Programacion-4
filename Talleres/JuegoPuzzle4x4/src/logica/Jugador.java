/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Usuario 1
 */
public class Jugador extends Elemento{
    // jugador es el objeto seleccionar
    public Jugador(int x, int y)
    {
        super(x,y,"jugador.png");
    }
    
    public void arriba()
    {
        y -=1;
    }
    
    public void abajo()
    {
        y += 1;
    }
    
    public void izquierda()
    {
        x -= 1;
    }
    
    public void derecha()
    {
        x += 1;
    }
}
