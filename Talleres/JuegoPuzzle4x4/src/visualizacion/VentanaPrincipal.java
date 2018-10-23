/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacion;
import logica.Juego;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Usuario 1
 */
public class VentanaPrincipal extends JFrame {
    private Juego puzzle4x4;
    private PanelDibujo panelDibujo;
    private PanelControl panelControl;
    public VentanaPrincipal()
    {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(200,300);
        setTitle("Puzzle 4 x 4");
        puzzle4x4 = new Juego();
        panelControl = new PanelControl(puzzle4x4);
        setLayout(new BorderLayout());
        panelDibujo = new PanelDibujo();
        getContentPane().add(panelDibujo,BorderLayout.CENTER);
        getContentPane().add(panelControl,BorderLayout.SOUTH);
        
        puzzle4x4.addObserver(panelDibujo);
        puzzle4x4.notificar();
    }
    
    public Juego getJuego()
    {
        return puzzle4x4;
    }
}
