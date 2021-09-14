/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zodiacal.sign;

/**
 *
 * @author Alexis
 */
public class Persona {

    private String nombre, apellido;
    private FechaHora diaDeNac;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public FechaHora getDiaDeNac() {
        return diaDeNac;
    }

    public void setDiaDeNac(FechaHora diaDeNac) {
        this.diaDeNac = diaDeNac;
    }

    public Persona(String nombre, String apellido, FechaHora diaDeNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaDeNac = diaDeNac;
    }
}
