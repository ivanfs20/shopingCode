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

        VentanaLogin inicio = new VentanaLogin();
    }
}
