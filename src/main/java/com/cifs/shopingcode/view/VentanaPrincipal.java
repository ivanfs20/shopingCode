/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class VentanaPrincipal extends JFrame {
    public static final int tamañoW = 600;
    public static final int tamañoH = 400;
    public static PanelLateral lateral = null;
    public static VentanaPrincipal ventanaPrincipal= null;
    public static String usuario = null;
    
    
    public VentanaPrincipal(String text) {
        usuario = text;
        ventanaPrincipal = this;
        this.setLayout(null);
        this.setSize(tamañoW, tamañoH);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelDeEncabezado n = new PanelDeEncabezado();
        this.add(n);
        PanelLateral l = new PanelLateral();
        lateral = l;
        this.add(l);
        
        this.repaint();
    }
}
