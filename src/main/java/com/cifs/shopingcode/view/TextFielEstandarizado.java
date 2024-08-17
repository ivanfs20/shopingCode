/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class TextFielEstandarizado extends JTextField{
    public TextFielEstandarizado(){
        this.setSize(110,20);
        this.setForeground(Color.white);
        this.setBackground(Color.DARK_GRAY);
        this.setFont(new Font("Dialog",Font.BOLD,15));
        this.setVisible(true);
    }
}
