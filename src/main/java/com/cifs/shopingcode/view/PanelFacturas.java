/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PanelFacturas extends PanelesLaterales {

    public PanelFacturas() {
        JTable tablaFacturas = new JTable();
        tablaFacturas.setLocation(5, 5);
        tablaFacturas.setSize(400, 400);
        tablaFacturas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaFacturas.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NOMBRE DE LA FACTURA");
        modelo.addColumn("ELIMINAR FACTURA");
        modelo.addColumn("ABRIR FACURA");
        String file = System.getProperty("user.home");
        File fileFile = new File(file + "/Downloads");
        File[] archivos = fileFile.listFiles();
        Object[] objecto = null;
        for (int i = 0; i < archivos.length; i++) {
            if (archivos[i].getName().endsWith(".txt")) {
                System.out.println(archivos[i].getName());
                //modelo.setValueAt(archivos[i].getName(), i, 0);
                objecto = new Object[3];
                objecto[0] = archivos[i].getName();
                objecto[1] = null;
                objecto[2] = null;
                modelo.addRow(objecto);
            }
            objecto = null;
        }

        tablaFacturas.setModel(modelo);
        JScrollPane scroll = new JScrollPane(tablaFacturas);
        scroll.setLocation(5, 5);
        scroll.setSize(455, 335);
        this.add(scroll);
    }
}
