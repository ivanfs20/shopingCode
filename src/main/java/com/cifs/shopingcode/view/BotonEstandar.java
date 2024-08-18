/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class BotonEstandar extends JButton {

    private static final int tamañoW = 10;
    private static final int tamañoH = 10;
    private static final Color colorBackD = Color.black;
    private static Color colorFore = Color.white;


    public BotonEstandar(String texto, int x, int y) {
        this.setText(texto);
        this.setSize(tamañoW, tamañoH);
        this.setBackground(colorBackD);
        this.setForeground(colorFore);
        this.setLocation(x, y);
        this.setFont(new Font("Dialog", Font.ITALIC, 2));
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setVisible(true);


    }
    
    public void asignarIcono(String url){
        ImageIcon original = new ImageIcon(url);
        Image copiaR = original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        original = new ImageIcon(copiaR);
        this.setIcon(original);
    }
    
}
