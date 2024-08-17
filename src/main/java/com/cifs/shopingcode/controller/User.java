/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifs.shopingcode.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "Table_User")
public class User implements Serializable {

    @Id
    @Column(name = "ID_USER")
    private Long id_user;
    @Column(name = "APELLIDO_PATERNO")
    private String ApPaterno;
    @Column(name = "APELLIDO_MATERNO")
    private String ApMaterno;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "FECHA_NACIMIENTO")
    private Date fecha_nacimiento;
    @Column(name = "DOMICILIO")
    private String domicilio;

    public User() {
    }

    public User(Long id_user, String ApPaterno, String ApMaterno, String nombre, Date fecha_nacimiento, String domicilio) {
        this.id_user = id_user;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.domicilio = domicilio;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "User{" + "id_user=" + id_user + ", ApPaterno=" + ApPaterno + ", ApMaterno=" + ApMaterno + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", domicilio=" + domicilio + '}';
    }

}
