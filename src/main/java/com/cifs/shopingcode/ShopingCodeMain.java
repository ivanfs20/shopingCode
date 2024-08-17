/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.cifs.shopingcode;

import com.cifs.shopingcode.model.conexionBaseDatos;
import com.cifs.shopingcode.view.VentanaLogin;
import com.cifs.shopingcode.view.VentanaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ShopingCodeMain {

    public static conexionBaseDatos bd = new conexionBaseDatos();

    public static void main(String[] args) {
        /*
                boolean bandera = true;
        do {
            int eleccion = Integer.parseInt(JOptionPane.showInputDialog("MENU"
                    + "\n 1.INSERTAR \n 2.MODIFICAR \n 3.ELIMINAR \n 4.CONSULTAR \n 5.V EXISTENCIA \n 6.SALIR"));
            switch (eleccion) {
                case 1:
                    bd.insertar();
                    break;
                case 2:
                    bd.editar();
                    break;
                case 3:
                    bd.eliminar();
                    break;
                case 4:
                    bd.consultar();
                    break;
                case 5:
                    boolean ba = bd.verificarExistencia(Long.parseLong(JOptionPane.showInputDialog("INGRESE ID DEL USUARIO")));
                    System.out.println("BANDERA: " + ba);
  110                  break;
                case 6:
                    System.out.println("FINALIZADO");
                    bandera = false;
                default:
                    System.out.println("INGRESA UN NUMERO DEL RANGO 1-5");
            }
        } while (bandera);
        */
        
        VentanaLogin inicio = new VentanaLogin();
    }
}
