package br.senai.bean;

import java.util.ArrayList;
import java.util.List;

public class Docente {
    private int id;
    private String nome;
    private List<Turma> turmas = new ArrayList<Turma>();

    public Docente(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
