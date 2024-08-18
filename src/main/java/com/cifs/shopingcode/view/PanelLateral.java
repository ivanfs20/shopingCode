/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import static com.cifs.shopingcode.view.VentanaPrincipal.ventanaPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class PanelLateral extends JPanel {

    public static final int tamañoW = 100;
    public static PanelLateral pnLateral = null;
    public static PanelVender pnVender = null;
    public static PanelStock pnStock = null;
    public static PanelFacturas pnFacturas = null;
    public static PanelConfiguracion pnConfiguracion = null;

    public PanelLateral() {
        this.setLayout(null);
        this.setSize(tamañoW, VentanaPrincipal.tamañoH - 50); //V T H = 400 -50 =350 / 4 = 
        //75 de H para cada Boton o seccion y 10 de separacoon
        this.setLocation(10, 35);
        this.setBackground(Color.DARK_GRAY);
        pnLateral = this;
        BotonEstandar vender = new BotonEstandar("VENDER", 0, 25);
        vender.setBackground(Color.DARK_GRAY);
        vender.setSize(100, 45);
        vender.setFont(new Font("Arial", Font.ITALIC, 10));
        vender.asignarIcono("src\\main\\resources\\Imagenes\\Icon_Sold.png");
        vender.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                vender.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                vender.setForeground(Color.white);
            }
        });

        vender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pnVender == null){pnVender = new PanelVender();}
                //if(pnVender != null){ventanaPrincipal.remove(pnVender);}
                if(pnStock != null){ventanaPrincipal.remove(pnStock); pnStock = null;}
                if(pnFacturas != null){ventanaPrincipal.remove(pnFacturas); pnFacturas = null;}
                if(pnConfiguracion != null){ventanaPrincipal.remove(pnConfiguracion); pnConfiguracion = null;}
                ventanaPrincipal.add(pnVender);
                ventanaPrincipal.repaint();
            }
        });
        this.add(vender);

        BotonEstandar stock = new BotonEstandar("STOCK", 0, 100);
        stock.setSize(100, 45);
        stock.setBackground(Color.DARK_GRAY);
        stock.setFont(new Font("Arial", Font.ITALIC, 10));
        stock.asignarIcono("src\\main\\resources\\Imagenes\\Icon_Stock.png");
        stock.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                stock.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                stock.setForeground(Color.white);
            }
        });
        
        stock.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pnStock == null){pnStock = new PanelStock();}
                if(pnVender != null){ventanaPrincipal.remove(pnVender); pnVender = null;}
               // if(pnStock != null){ventanaPrincipal.remove(pnStock);}
                if(pnFacturas != null){ventanaPrincipal.remove(pnFacturas); pnFacturas = null;}
                if(pnConfiguracion != null){ventanaPrincipal.remove(pnConfiguracion); pnConfiguracion = null;}
                ventanaPrincipal.add(pnStock);
                ventanaPrincipal.repaint();
            }
        });
        
        this.add(stock);

        BotonEstandar facturas = new BotonEstandar("FACTURAS", 0, 175);
        facturas.setSize(100, 45);
        facturas.setBackground(Color.DARK_GRAY);
        facturas.setFont(new Font("Arial", Font.ITALIC, 10));
        facturas.asignarIcono("src\\main\\resources\\Imagenes\\Icon_Factura.png");
        facturas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                facturas.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                facturas.setForeground(Color.white);
            }
        });
        
        facturas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pnFacturas == null){pnFacturas = new PanelFacturas();}
                if(pnVender != null){ventanaPrincipal.remove(pnVender); pnVender = null;}
                if(pnStock != null){ventanaPrincipal.remove(pnStock); pnStock = null;}
               // if(pnFacturas != null){ventanaPrincipal.remove(pnFacturas);}
                if(pnConfiguracion != null){ventanaPrincipal.remove(pnConfiguracion); pnConfiguracion = null;}
                ventanaPrincipal.add(pnFacturas);
                ventanaPrincipal.repaint();
            }
        
        });
        
        this.add(facturas);

        BotonEstandar configuracion = new BotonEstandar("CONF", 0, 250);
        configuracion.setSize(100, 45);
        configuracion.setBackground(Color.DARK_GRAY);
        configuracion.setFont(new Font("Arial", Font.ITALIC, 10));
        configuracion.asignarIcono("src\\main\\resources\\Imagenes\\Icon_Configuracion.png");
        configuracion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                configuracion.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                configuracion.setForeground(Color.white);
            }
        });
        
        configuracion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pnConfiguracion == null){pnConfiguracion = new PanelConfiguracion();}
                if(pnVender != null){ventanaPrincipal.remove(pnVender); pnVender = null;}
                if(pnStock != null){ventanaPrincipal.remove(pnStock); pnStock = null;}
                if(pnFacturas != null){ventanaPrincipal.remove(pnFacturas); pnFacturas = null;}
                //if(pnConfiguracion != null){ventanaPrincipal.remove(pnConfiguracion);}
                ventanaPrincipal.add(pnConfiguracion);
                ventanaPrincipal.repaint();
            }
        
        });
        this.add(configuracion);

        this.setVisible(true);

    }
}
