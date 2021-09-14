/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zodiacal.sign;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Alexis
 */
public class FechaHora {

    private LocalDate fechaYHora;

    public FechaHora(LocalDate fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public LocalDate getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDate fechaYHora) {
        this.fechaYHora = fechaYHora;

    }

    @Override
    public String toString() {
        return "FechaHora{" + "fechaYHora=" + fechaYHora + '}';
    }

    public String determinarSigno() {
        if (fechaYHora.getMonth() == Month.MARCH && fechaYHora.getDayOfMonth() >= 21
                || fechaYHora.getMonth() == Month.APRIL && fechaYHora.getDayOfMonth() <= 20) {
            return "Aries";
        }
        if (fechaYHora.getMonth() == Month.APRIL && fechaYHora.getDayOfMonth() >= 21
                || fechaYHora.getMonth() == Month.MAY && fechaYHora.getDayOfMonth() <= 21) {
            return "Tauro";
        }
        if (fechaYHora.getMonth() == Month.MAY && fechaYHora.getDayOfMonth() >= 22
                || fechaYHora.getMonth() == Month.JUNE && fechaYHora.getDayOfMonth() <= 21) {
            return "Geminis";
        }
        if (fechaYHora.getMonth() == Month.JUNE && fechaYHora.getDayOfMonth() >= 22
                || fechaYHora.getMonth() == Month.JULY && fechaYHora.getDayOfMonth() <= 23) {
            return "Cancer";
        }
        if (fechaYHora.getMonth() == Month.JULY && fechaYHora.getDayOfMonth() >= 24
                || fechaYHora.getMonth() == Month.AUGUST && fechaYHora.getDayOfMonth() <= 23) {
            return "Leo";
        }
        if (fechaYHora.getMonth() == Month.AUGUST && fechaYHora.getDayOfMonth() >= 24
                || fechaYHora.getMonth() == Month.SEPTEMBER && fechaYHora.getDayOfMonth() <= 23) {
            return "Virgo";
        }
        if (fechaYHora.getMonth() == Month.SEPTEMBER && fechaYHora.getDayOfMonth() >= 24
                || fechaYHora.getMonth() == Month.OCTOBER && fechaYHora.getDayOfMonth() <= 23) {
            return "Libra";
        }
        if (fechaYHora.getMonth() == Month.OCTOBER && fechaYHora.getDayOfMonth() >= 24
                || fechaYHora.getMonth() == Month.NOVEMBER && fechaYHora.getDayOfMonth() <= 22) {
            return "Escorpio";
        }
        if (fechaYHora.getMonth() == Month.NOVEMBER && fechaYHora.getDayOfMonth() >= 23
                || fechaYHora.getMonth() == Month.DECEMBER && fechaYHora.getDayOfMonth() <= 21) {
            return "Sagitario";
        }
        if (fechaYHora.getMonth() == Month.DECEMBER && fechaYHora.getDayOfMonth() >= 21
                || fechaYHora.getMonth() == Month.JANUARY && fechaYHora.getDayOfMonth() <= 20) {
            return "Capricornio";
        }
        if (fechaYHora.getMonth() == Month.JANUARY && fechaYHora.getDayOfMonth() >= 21
                || fechaYHora.getMonth() == Month.FEBRUARY && fechaYHora.getDayOfMonth() <= 19) {
            return "Acuario";
        }
        if (fechaYHora.getMonth() == Month.FEBRUARY && fechaYHora.getDayOfMonth() >= 20
                || fechaYHora.getMonth() == Month.MARCH && fechaYHora.getDayOfMonth() <= 20) {
            return "Piscis";
        }
        return "Probablemente se haya ingresado una fecha no válida";
    }
}
