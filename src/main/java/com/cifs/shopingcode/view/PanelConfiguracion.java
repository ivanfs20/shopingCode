/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import static com.cifs.shopingcode.view.VentanaPrincipal.ventanaPrincipal;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;

/**
 *
 * @author HP
 */
public class PanelConfiguracion extends PanelesLaterales{
    public PanelConfiguracion(){
        LabelEstandarizado sucursal = new LabelEstandarizado("SUCURSAL: ",15);
        sucursal.setLocation(65,100);
        sucursal.setSize(500, 20);
        this.add(sucursal);
        LabelEstandarizado nameSucursal = new LabelEstandarizado("NOMBRE: ",15);
        nameSucursal.setLocation(65, 130);
        nameSucursal.setSize(500, 20);
        this.add(nameSucursal);
        LabelEstandarizado numeroEmpleado = new LabelEstandarizado("NUMERO EMPLEADO: ",15);
        numeroEmpleado.setLocation(65,160);
        numeroEmpleado.setSize(500, 20);
        this.add(numeroEmpleado);
        
        System.out.println("User: "+VentanaPrincipal.usuario);
        
        LabelEstandarizado nameEmpleado = new LabelEstandarizado("NOMBRE: "+VentanaPrincipal.usuario,15);
        nameEmpleado.setLocation(65, 190);
        nameEmpleado.setSize(500, 20);
        this.add(nameEmpleado);
        
        BotonEstandar salir = new BotonEstandar("SALIR",200,310);
         salir.setSize(100, 25);
         salir.setFont(new Font("Dialog", Font.BOLD, 10));
        salir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaLogin ventanaLogin = new VentanaLogin();
                ventanaPrincipal.dispose();
               
            }
        });
        
        this.add(salir);
        
    }
}
