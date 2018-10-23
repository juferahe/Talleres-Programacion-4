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
public class Ficha extends Elemento{
    private int representacion;
    
    public Ficha(int x, int y, String nombre, int representacion)
    {
        super(x,y,nombre);        
        this.representacion = representacion;
    }

    public int getRepresentacion() {
        return representacion;
    }
    
    
}
