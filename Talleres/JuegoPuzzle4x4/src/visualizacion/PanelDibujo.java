/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacion;

import java.awt.Graphics;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

// aqui faltan mas clases del paquete logica
import logica.Juego;
import logica.Ficha;
/**
 *
 * @author Usuario 1
 */

// falta implementar observer
public class PanelDibujo extends JPanel implements Observer{
    private Object objObservable;
    
    public void paint(Graphics g)
    {
        Juego juego = (Juego)this.objObservable;
        g.setColor(new Color(20,20,20));
        //System.out.println("Width: " + this.getWidth() + " Height: " + this.getHeight());
        //g.fillRect(0, 0, this.getWidth(), this.getHeight());

        for(Ficha ficha: juego.getTablero())
        {
            //g.drawImage(ficha.getImage(), 
            //        ficha.getX() * ficha.getImage().getWidth(this),
            //        ficha.getY() * ficha.getImage().getHeight(this), this);
            g.drawImage(ficha.getImage(), ficha.getX() * 32, 
                    ficha.getY() * 32, this);
        }
        g.drawImage(juego.getJugador().getImage(), 
                juego.getJugador().getX() * 32, 
                juego.getJugador().getY() * 32, this);
    }
    
    @Override
    public void update(Observable arg0, Object arg1)
    {
        this.objObservable = arg1;
        this.repaint();
    }
}
