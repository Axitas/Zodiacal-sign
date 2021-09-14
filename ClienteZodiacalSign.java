package com.mycompany.zodiacal.sign;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexis
 */
public class ClienteZodiacalSign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> myRef = new ArrayList();
//     Persona p1= new Persona("Jorge","Velez",new FechaHora(LocalDate.of(1955, Month.SEPTEMBER, 19)));
        myRef.add(new Persona("Maximo", "Virgolini", new FechaHora(LocalDate.of(1955, Month.SEPTEMBER, 19))));
        myRef.add(new Persona("Esther", "Cancer", new FechaHora(LocalDate.of(1981, Month.JUNE, 29))));
        myRef.add(new Persona("Pececito", "Ramirez", new FechaHora(LocalDate.of(1999, Month.MARCH, 16))));
        myRef.add(new Persona("Del", "Sahara", new FechaHora(LocalDate.of(2000, Month.NOVEMBER, 19))));
        System.out.println(myRef.get(0).getDiaDeNac().determinarSigno());//Should return Virgo
        System.out.println(myRef.get(1).getDiaDeNac().determinarSigno());//Should return Cancer
        System.out.println(myRef.get(2).getDiaDeNac().determinarSigno());//Should return Piscis    
        System.out.println(myRef.get(3).getDiaDeNac().determinarSigno());//Should return Escorpio
    }

}
