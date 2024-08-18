/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class LabelEstandarizado extends JLabel{
    public LabelEstandarizado(String texto){
        this.setSize(110,20);
        this.setText(texto);
        this.setFont(new Font("Dialog",Font.ROMAN_BASELINE,8));
        this.setVisible(true);
    }

    public LabelEstandarizado(String texto,int sizeFont){
        this.setSize(200,20);
        this.setText(texto);
        this.setFont(new Font("Serif",Font.ROMAN_BASELINE,sizeFont));
        this.setVisible(true);
    
}
}