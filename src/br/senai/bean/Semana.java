package br.senai.bean;

import java.time.LocalDate;
import java.util.List;

public class Semana {
    private LocalDate dataInicio;
    private List<Dia> dias;

    public Semana(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }
}
