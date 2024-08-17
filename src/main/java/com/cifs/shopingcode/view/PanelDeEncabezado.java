/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import static com.cifs.shopingcode.view.PanelLateral.pnConfiguracion;
import static com.cifs.shopingcode.view.PanelLateral.pnFacturas;
import static com.cifs.shopingcode.view.PanelLateral.pnLateral;
import static com.cifs.shopingcode.view.PanelLateral.pnStock;
import static com.cifs.shopingcode.view.PanelLateral.pnVender;
import static com.cifs.shopingcode.view.VentanaLogin.ventanaLogin;
import static com.cifs.shopingcode.view.VentanaPrincipal.ventanaPrincipal;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class PanelDeEncabezado extends JPanel {

    public static final int tamañoW = VentanaPrincipal.tamañoW;
    public static final int tamañoH = 25;
    
    public static PanelDeEncabezado direccion = null;

    public PanelDeEncabezado() {
        this.setSize(tamañoW, tamañoH);
        this.setLocation(0, 0);
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
        BotonEstandar botonSalir = new BotonEstandar("X", 588, 6);
        botonSalir.setBackground(Color.red);
        direccion = this;
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PanelAlertas pnAlertas = new PanelAlertas();
                pnAlertas.ingresarTexto("CLOSE", "¿QUIERES SALIR "
                        + "\nDE LA\n"
                        + " APLICACIÓN?", "src\\main\\resources\\Imagenes\\Icon_Close.png");
                pnAlertas.setLocation(250, 125);
                if (ventanaLogin != null) {
                    ventanaLogin.dispose();
                }

                if (ventanaPrincipal != null) {
                    if (pnVender != null) {
                        ventanaPrincipal.remove(pnVender);
                        pnVender = null;
                    }
                    if (pnStock != null) {
                        ventanaPrincipal.remove(pnStock);
                        pnStock = null;
                    }
                    if (pnFacturas != null) {
                        ventanaPrincipal.remove(pnFacturas);
                        pnFacturas = null;
                    }
                    if (pnConfiguracion != null) {
                        ventanaPrincipal.remove(pnConfiguracion);
                        pnConfiguracion = null;
                    }
                    
                    
                    if(ventanaPrincipal != null){
                    ventanaPrincipal.add(pnAlertas);
                    ventanaPrincipal.repaint();
                    }
                    
                }
            }

        });

        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent evento) {
                int x = evento.getXOnScreen();
                int y = evento.getYOnScreen();

                if (ventanaLogin != null) {
                    ventanaLogin.setLocation(x, y);
                }

                if (ventanaPrincipal != null) {
                    ventanaPrincipal.setLocation(x, y);
                }

                direccion.repaint();
            }

        });

        this.add(botonSalir);
    }

}
