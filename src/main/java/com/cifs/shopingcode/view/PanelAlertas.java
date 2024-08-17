/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import static com.cifs.shopingcode.view.VentanaPrincipal.ventanaPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author HP
 */
public class PanelAlertas extends JPanel {

    public static PanelAlertas panelAlertas = null;

    public PanelAlertas() {
        GroupLayout gr = new GroupLayout(this);
        this.setSize(200, 150);
        this.setBackground(Color.black);
        
        panelAlertas = this;
        BotonEstandar btnYes = new BotonEstandar("YES", 25, 120);
        btnYes.setSize(50, 25);
        btnYes.setBackground(Color.white);
        btnYes.setForeground(Color.black);
        btnYes.setFont(new Font("Dialog", Font.ITALIC, 8));
        btnYes.setVisible(true);

        btnYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.dispose();
            }

        });

        BotonEstandar btnNo = new BotonEstandar("NO", 135, 120);
        btnNo.setSize(50, 25);
        btnNo.setBackground(Color.white);
        btnNo.setForeground(Color.black);
        btnNo.setFont(new Font("Dialog", Font.ITALIC, 8));
        btnNo.setVisible(true);

        btnNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.remove(panelAlertas);
                panelAlertas = null;
                ventanaPrincipal.repaint();
            }

        });
       // ingresarTexto(tipo,mensaje);

        this.add(btnYes);
        this.add(btnNo);
        //this.add(labelMensaje);
        this.setVisible(true);
    }

    public void ingresarTexto(String tipo, String mensaje, String imageIcon) {
        ImageIcon original = new ImageIcon(imageIcon);
        Image iconoRen = original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        original = new ImageIcon(iconoRen);
                JLabel labelMensaje = new JLabel(original);
        labelMensaje.setText(mensaje);
        labelMensaje.setFont(new Font("Dialog",Font.ITALIC,10));
        labelMensaje.setForeground(Color.white);
        labelMensaje.setSize(190, 100);
        labelMensaje.setLocation(5, 5);
        labelMensaje.setHorizontalAlignment(SwingConstants.CENTER);
        labelMensaje.setVerticalTextPosition(SwingConstants.CENTER);
        labelMensaje.setVisible(true);
        this.add(labelMensaje);
    }
}
