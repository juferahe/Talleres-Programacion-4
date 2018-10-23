/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author Usuario 1
 */
public class Elemento {
    protected int x;
    protected int y;
    protected Image image;
    
    public Elemento(int x, int y, String nombre)
    {
        //System.out.println("x: " + x + " y: " + y + " nombre: " + nombre);
        String ruta = "imgs/" + nombre;
        //System.out.println(ruta);
        this.x = x;
        this.y = y;
        this.image = Toolkit.getDefaultToolkit().getImage(ruta);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
