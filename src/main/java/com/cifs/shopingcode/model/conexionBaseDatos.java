/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.model;

import com.cifs.shopingcode.controller.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class conexionBaseDatos {

    private static EntityManager manager = null;
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionBD");

    private EntityManager crearEM() {
        System.out.println("NO PROBLEM CEM");
        return emf.createEntityManager();
    }

    public void insertar() {
        System.out.println("NO PROBLEM");
        Long valor = Long.parseLong(JOptionPane.showInputDialog("Ingresa el codigo de usuario"));
        manager = crearEM();
        manager.getTransaction().begin();
        manager.persist(new User(valor, JOptionPane.showInputDialog("APELLIDO PATERNO"), JOptionPane.showInputDialog("APELLIDO MATERNO"), JOptionPane.showInputDialog("NOMBRE"), new GregorianCalendar(Integer.parseInt(JOptionPane.showInputDialog("AÑO")), Integer.parseInt(JOptionPane.showInputDialog("MES")), Integer.parseInt(JOptionPane.showInputDialog("DIA"))).getTime(), JOptionPane.showInputDialog("DOMICILIO")));
        manager.getTransaction().commit();
        manager.close();

    }

    public void consultar() {
        manager = crearEM();
        List<User> listaUsuarios = (List<User>) manager.createQuery("FROM User", User.class).getResultList();
        for (User usuarios : listaUsuarios) {
            System.out.println(usuarios.toString());
        }
        manager.close();
    }

    public void editar() {
        Long user = Long.parseLong(JOptionPane.showInputDialog("Ingresa el codigo de usuario"));

        manager = crearEM();
        manager.getTransaction().begin();
        User usuario = manager.find(User.class, user);
        usuario.setApPaterno(JOptionPane.showInputDialog("Ingresa el Apellido Paterno"));
        usuario.setApMaterno(JOptionPane.showInputDialog("Ingresa el Apellido Materno"));
        usuario.setFecha_nacimiento(new GregorianCalendar(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año")), Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes")), Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia"))).getTime());
        usuario.setDomicilio(JOptionPane.showInputDialog("Ingresa el Domiciliio"));
        manager.getTransaction().commit();
        manager.close();

    }

    public void eliminar() {
        Long valor = Long.parseLong(JOptionPane.showInputDialog("Ingresa el codigo de usuario"));

        manager = crearEM();
        manager.getTransaction().begin();
        User usuario = manager.find(User.class, valor);
        manager.remove(usuario);
        manager.getTransaction().commit();
        manager.close();

    }

    public boolean verificarExistencia(Long id) {
        System.out.println("NO PROBLEM VF");
        manager = crearEM();

        User usuario = null;
        try {
            usuario = manager.find(User.class, id);
        } catch (Exception e) {
        }

        if (usuario == null) {
            return false;
        } else {
            return true;
        }
    }

}
