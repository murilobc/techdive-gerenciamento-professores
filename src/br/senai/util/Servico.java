package br.senai.util;

import br.senai.bean.Dia;
import br.senai.bean.Docente;
import br.senai.bean.Semana;
import br.senai.bean.Turma;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Servico {

    public int gerarCodigo(List<?> bd) {
        if (bd.isEmpty()) {
            return 10000;
        } else {
            if (bd.get(0) instanceof Turma) {
                return ((Turma) bd.get(bd.size() - 1)).getId() + 1;
            } else {
                return ((Docente) bd.get(bd.size() - 1)).getId() + 1;
            }
        }
    }

    public void salvarTurma(Turma t, List<Turma> turmas) {
        if (t.getId() > 0) {
            t = gerarSemanasDeAula(t);
            turmas.add(t);
        }
    }

    private Turma gerarSemanasDeAula(Turma t) {
        for (int i = 0; i < 52; i++) {
            Semana s = new Semana(ChronoUnit.WEEKS.addTo(t.getInicioAula(), i));
            s = gerarDias(s);
            t.getSemanas().add(s);
        }
        return t;
    }

    private Semana gerarDias(Semana s) {
        List<Dia> dias = new ArrayList<Dia>();
        for (int i = 0; i < 7; i++) {
            LocalDate data = ChronoUnit.DAYS.addTo(s.getDataInicio(), i);
            Dia d = new Dia(data.getDayOfWeek().getValue(), data);
            dias.add(d);
        }
        s.setDias(dias);
        return s;
    }

    public void salvarDocente(Docente d, List<Docente> docentes) {
        if (d.getId() > 0) {
            docentes.add(d);
        } else {
            for (int i = 0; i < docentes.size(); i++) {
                if (docentes.get(i).getId() == d.getId()) {
                    docentes.get(i).setNome(d.getNome());
                }
            }
        }
    }

    public void alocarDocente(int idDocente, int idTurma, List<Turma> turmas, List<Docente> docentes) {
        for (int i = 0; i < docentes.size(); i++) {
            if (docentes.get(i).getId() == idDocente) {

            }
        }
    }
}
