/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacion;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logica.Juego;
/**
 *
 * @author Usuario 1
 */
public class PanelControl extends JPanel {
    private Juego juego;
    private JButton arriba;
    private JButton abajo;
    private JButton izquierda;
    private JButton derecha;
    private JButton seleccionar;
    private JLabel espacio1;
    private JLabel espacio2;
    private JLabel espacio3;
    private JLabel espacio4;
    
    
    public PanelControl(Juego juego)
    {
        this.juego = juego;
        this.setLayout(new GridLayout(3,3,0,0));
        this.setBorder(BorderFactory.createTitledBorder("Controles Puzzle"));
        
        // inicializar boton arriba arriba
        {
            espacio1 = new JLabel("");
            this.add(espacio1);
            arriba = new JButton("^");
            arriba.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                {
                    arribaActionPerformed();
                }
            });
            this.add(arriba);
            espacio2 = new JLabel("");
            this.add(espacio2);
        }
        // inicializar boton izquierda
        {
            izquierda = new JButton("<");
            this.add(izquierda);
            izquierda.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                {
                    izquierdaActionPerformed();
                }
            });

        }
        // inicializar boton seleccionar
        {
            seleccionar = new JButton("sel");
            seleccionar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                {
                    seleccionarActionPerformed();
                }
            });
            this.add(seleccionar);

        }
        // inicializar boton derecha
        {
            derecha = new JButton(">");
            this.add(derecha);
            derecha.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                {
                    derechaActionPerformed();
                }
            });
        }
        // inicializar boton abajo
        {
            espacio3 = new JLabel("");
            this.add(espacio3);
            abajo = new JButton("v");
            abajo.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                {
                    abajoActionPerformed();
                }
            });
            this.add(abajo);
            espacio4 = new JLabel("");
            this.add(espacio4);        
        }
    }
    
    public void arribaActionPerformed()
    {
        juego.arriba();
    }
    
    public void izquierdaActionPerformed()
    {
        juego.izquierda();
    }
    
    public void derechaActionPerformed()
    {
        juego.derecha();
    }
    
    public void abajoActionPerformed()
    {
        juego.abajo();
    }
    
    public void seleccionarActionPerformed()
    {
        juego.seleccionar();
    }
}
