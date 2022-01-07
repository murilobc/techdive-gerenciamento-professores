package br.senai.bean;

import java.time.LocalDate;

public class Dia {
    private int diaDaSemana;
    private LocalDate dia;
    private Docente docente;

    public Dia(int diaDaSemana, LocalDate dia) {
        this.diaDaSemana = diaDaSemana;
        this.dia = dia;
    }

    public int getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(int diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
