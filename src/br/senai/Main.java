package br.senai;

import br.senai.bean.Docente;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LocalDate lastVisible = LocalDate.of(2017, 3, 12);
        LocalDate dateToSelect = LocalDate.of(2018, 3, 13).minusDays(1);

        long weeks = ChronoUnit.WEEKS.between(lastVisible, dateToSelect);
        System.out.println("number of weeks "+ weeks);
        System.out.println(lastVisible.getDayOfWeek().getValue());
        System.out.println(ChronoUnit.WEEKS.addTo(lastVisible, 1).getDayOfWeek().getValue());
        System.out.println(lastVisible);

        List<Docente> lista = new ArrayList<Docente>();
        Docente d1 = new Docente(1, "1");
        Docente d2 = new Docente(2, "2");
        lista.add(d1);
        lista.add(d2);
        System.out.println(lista);

        Docente d3 = lista.get(0);
        d3.setNome("3");
        lista.add(d3);

        System.out.println(lista);


    }

}
