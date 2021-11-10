/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author dani_
 */
public class PanelButtons extends JPanel{
    private JButton btnRed;
    private JButton btnGreen;
    private JButton btnBlue;

    
    public PanelButtons(){
        super.setBackground(Color.white);
        super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));        
        
        btnRed = new JButton("Rojo");
        btnGreen = new JButton("Verde");
        btnBlue = new JButton("Azul");
        
        add(Box.createRigidArea(new Dimension(500, 0)));
        add(btnRed);
        add(Box.createRigidArea(new Dimension(20, 0)));
        add(btnGreen);
        add(Box.createRigidArea(new Dimension(20, 0)));
        add(btnBlue);                
    }
        public JButton getBtnRed() {
        return btnRed;
    }

    public void setBtnRed(JButton btnRed) {
        this.btnRed = btnRed;
    }

    public JButton getBtnGreen() {
        return btnGreen;
    }

    public void setBtnGreen(JButton btnGreen) {
        this.btnGreen = btnGreen;
    }

    public JButton getBtnBlue() {
        return btnBlue;
    }

    public void setBtnBlue(JButton btnBlue) {
        this.btnBlue = btnBlue;
    }
}
