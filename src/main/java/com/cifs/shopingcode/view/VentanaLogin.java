/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import static com.cifs.shopingcode.view.VentanaPrincipal.lateral;
import static com.cifs.shopingcode.view.VentanaPrincipal.tamañoH;
import static com.cifs.shopingcode.view.VentanaPrincipal.tamañoW;
import static com.cifs.shopingcode.view.VentanaPrincipal.ventanaPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class VentanaLogin extends JFrame{
    
    public static VentanaLogin ventanaLogin = null;
    
    public VentanaLogin() {
        this.setLayout(null);
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setResizable(false);
        ventanaLogin = this;
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelDeEncabezado n = new PanelDeEncabezado();
        n.setSize(300, 20);
        BotonEstandar salirbtn = new BotonEstandar("X",280,5);
        salirbtn.setBackground(Color.red);
        salirbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaLogin.dispose();
            }
        });
        n.add(salirbtn);
        this.add(n);
        
        LabelEstandarizado user = new LabelEstandarizado("USUARIO: ",12);
        user.setLocation(15, 55);
        user.setSize(70, 20);
        this.add(user);
        TextFielEstandarizado txtUser = new TextFielEstandarizado();
        txtUser.setLocation(150, 55);
        this.add(txtUser);
        
        LabelEstandarizado password = new LabelEstandarizado("CONTRASEÑA: ",12);
        password.setLocation(15,90);
        password.setSize(90,20);
        this.add(password);
        TextFielEstandarizado txtPassword = new TextFielEstandarizado();
        txtPassword.setLocation(150, 90);
        this.add(txtPassword);
        
        BotonEstandar btnLogin = new BotonEstandar("LOGIN",100,160);
        btnLogin.setSize(100, 25);
         btnLogin.setFont(new Font("Dialog", Font.BOLD, 10));
         btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaLogin.dispose();
                VentanaPrincipal ventanaP = new VentanaPrincipal(txtUser.getText());
            }
        });
         
         
         this.add(btnLogin);
         
        this.repaint();
    }
}
