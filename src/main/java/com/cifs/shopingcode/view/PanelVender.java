/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PanelVender extends PanelesLaterales {

    /*
    PARA FACTURAS - VENDER
    
    1. CODIGO DEL PRODUCTO -> CUANDO COLOQUE ESTO, LO DEMAS DEBE APARECER
    2. NOMBRE DEL PRODUCTO
    3. PRECIO DEL PRODUCTO
    4. CANTIDAD DEL PRODUCTO
    5. PROVEEDOR
    
    CLIENTE
    
    1. Nombre -> Apellidos | Nombre 
    2. Correo Electronico
    3. Numero de Celular
    
    TIENDA
    
    1. Numero de sucursal -> ESTO POR DEFECTO SERA LLENADO EN CONFIGURACION
    2. Nombre de la sucursal
    3. Nombre del trabajador -> Es del login que estara en configuracion
    
    
    
     */
    public static int numeroRow = 0;
    public static PanelVender pnVender = null;
    public static String nameFIle = null;

    public PanelVender() {
        GroupLayout gr = new GroupLayout(this);

        //TAMAÑOS STANDAR = W (110) / H (20)
        LabelEstandarizado tApPaterno = new LabelEstandarizado("APELLIDO PATERNO");
        tApPaterno.setLocation(5, 5);
        this.add(tApPaterno);
        TextFielEstandarizado ApPaterno = new TextFielEstandarizado();
        ApPaterno.setLocation(5, 30);
        this.add(ApPaterno);

        LabelEstandarizado tApMaterno = new LabelEstandarizado("APELLIDO MATERNO");
        tApMaterno.setLocation(120, 5);
        this.add(tApMaterno);
        TextFielEstandarizado ApMaterno = new TextFielEstandarizado();
        ApMaterno.setLocation(120, 30);
        this.add(ApMaterno);

        LabelEstandarizado tNombre1 = new LabelEstandarizado("APELLIDO NOMBRE 1");
        tNombre1.setLocation(235, 5);
        this.add(tNombre1);
        TextFielEstandarizado Nombre1 = new TextFielEstandarizado();
        Nombre1.setLocation(235, 30);
        this.add(Nombre1);

        LabelEstandarizado tNombre2 = new LabelEstandarizado("APELLIDO NOMBRE 2 (OP)");
        tNombre2.setLocation(350, 5);
        this.add(tNombre2);
        TextFielEstandarizado Nombre2 = new TextFielEstandarizado();
        Nombre2.setLocation(350, 30);
        this.add(Nombre2);

        LabelEstandarizado tCodigo = new LabelEstandarizado("CODIGO");
        tCodigo.setLocation(5, 50);
        this.add(tCodigo);
        TextFielEstandarizado codigo = new TextFielEstandarizado();
        codigo.setLocation(5, 75);
        this.add(codigo);

        LabelEstandarizado tCantidad = new LabelEstandarizado("CANTIDAD");
        tCantidad.setLocation(120, 50);
        this.add(tCantidad);
        TextFielEstandarizado cantidad = new TextFielEstandarizado();
        cantidad.setLocation(120, 75);
        this.add(cantidad);

        // Crear la tabla
        JTable tabla = new JTable();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("PROVEEDOR");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        modelo.addColumn("ELIMINAR");  // Asumiendo que BotonEstandar es un JButton o similar

        tabla.setModel(modelo);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setReorderingAllowed(false);

        // Añadir la tabla a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(5, 100, 450, 200); // Ajusta el tamaño y la posición

        this.add(scrollPane); // Añadir el JScrollPane al panel

        // tabla.add
        BotonEstandar agregar = new BotonEstandar("AGREGAR", 350, 65);
        agregar.setSize(100, 25);
        agregar.setFont(new Font("Dialog", Font.BOLD, 10));
        nameFIle = Nombre1.getText();
        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object s[] = {codigo.getText(), "PRODUCTO NAME", 3, 4, 5, 6};
                modelo.addRow(s);
                numeroRow = numeroRow + 1;
            }
        });
        this.add(agregar);
        pnVender = this;

        BotonEstandar imprimirFactura = new BotonEstandar("IMPRIMIR", 355, 310);
        imprimirFactura.setSize(100, 25);
        imprimirFactura.setFont(new Font("Dialog", Font.BOLD, 10));
        imprimirFactura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HOLA");
                String systemUserHome = System.getProperty("user.home");
                String descargas = systemUserHome + "/Downloads";
                nameFIle = Nombre1.getText();
                File file = new File(descargas + "/" + nameFIle + ".txt");

                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    FileWriter fileWriter = new FileWriter(file);
                    BufferedWriter bfWriter = new BufferedWriter(fileWriter);
                    bfWriter.write("");
                    bfWriter.newLine();
                    bfWriter.write("");
                    bfWriter.newLine();
                    bfWriter.write("Cliente: " + ApPaterno.getText() + " " + ApMaterno.getText() + " " + Nombre1.getText() + " " + Nombre2.getText());
                    bfWriter.newLine();
                    bfWriter.write("PRODUCTOS: ");
                    bfWriter.newLine();
                    bfWriter.write("------------------------------");
                    bfWriter.newLine();

                    for (int i = 0; i < modelo.getRowCount(); i++) {
                        bfWriter.write("CG: " + modelo.getValueAt(i, 0));
                        bfWriter.write("NOMBRE: " + modelo.getValueAt(i, 1));
                        bfWriter.write("PROVEDOR: " + modelo.getValueAt(i, 2));
                        bfWriter.write("CANTIDAD: " + modelo.getValueAt(i, 3));
                        bfWriter.write("PRECIO: " + modelo.getValueAt(i, 4));
                        // bfWriter.write(" "+modelo.getValueAt(i, 5));
                        bfWriter.newLine();
                        bfWriter.write("------------------------------");
                        bfWriter.newLine();
                    }
                    bfWriter.newLine();
                    bfWriter.write("ATENDIO: ");
                    bfWriter.close();
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(PanelVender.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        this.add(imprimirFactura);

        BotonEstandar cancelar = new BotonEstandar("CANCELAR", 235, 310);
        cancelar.setSize(100, 25);
        cancelar.setFont(new Font("Dialog", Font.BOLD, 10));
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroRow != 0) {
                    for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                        modelo.removeRow(i);
                    }
                }
            }
        });

        this.add(cancelar);
    }

}
