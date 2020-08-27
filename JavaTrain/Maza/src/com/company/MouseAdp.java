package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseAdp implements MouseListener {
    Label jLabel;
    @Override
    public void mouseClicked(MouseEvent e) {
       if( Color.ORANGE==jLabel.getBackground()){
//           JLabel
           jLabel.setBackground(Color.white);
       }else jLabel.setBackground(Color.ORANGE);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void SetLabel(Label Label){
        this.jLabel=Label;
    }
}
