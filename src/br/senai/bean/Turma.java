package br.senai.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int id;
    private String nome;
    private int qtdAlunos;
    private LocalDate inicioAula;
    private List<String> assuntos = new ArrayList<String>();
    private List<Semana> semanas = new ArrayList<Semana>();

    public Turma(int id, String nome, int qtdAlunos, LocalDate inicioAula) {
        this.id = id;
        this.nome = nome;
        this.qtdAlunos = qtdAlunos;
        this.inicioAula = inicioAula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public LocalDate getInicioAula() {
        return inicioAula;
    }

    public void setInicioAula(LocalDate inicioAula) {
        this.inicioAula = inicioAula;
    }

    public List<String> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(List<String> assuntos) {
        this.assuntos = assuntos;
    }

    public List<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(List<Semana> semanas) {
        this.semanas = semanas;
    }
}
