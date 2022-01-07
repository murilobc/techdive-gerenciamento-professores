package br.senai;

import br.senai.bean.Docente;
import br.senai.bean.Turma;
import br.senai.util.Servico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciar {
    Scanner input = new Scanner(System.in);
    Servico servico = new Servico();
    List<Turma> turmas = new ArrayList<Turma>();
    List<Docente> docentes = new ArrayList<Docente>();

    public void iniciar() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Escolha uma opção: ")
                .append("\n1 - Cadastrar turma")
                .append("\n2 - Cadastrar docente")
                .append("\n3 - Alocar docente")
                .append("\n4 - Listar turmas com assuntos, docentes e semanas")
                .append("\n5 - Listar todos os docentes")
                .append("\n6 - Listar docentes e suas semanas definidas")
                .append("\n0 - Sair");

        String opcao = input.nextLine();
        if (opcao.isBlank()) {
            System.out.println("Opção inválida");
            iniciar();
        } else {
            switch (opcao) {
                case "1":
                    menuCadastroTurma();
                    break;
                case "2":
                    menuCadastroDocente();
                    break;
                case "3":
                    menuAlocarDocente();
                    break;
                case "4":
//                    menuListarTurmas();
                    break;
                case "5":
//                    menuListarTodosDocentes();
                    break;
                case "6":
//                    menuListarDocentesSemanas();
                    break;
                case "0":
                    System.out.println("Saindo...");
                    break;
                default:
                    iniciar();
            }
        }
    }

    private void menuAlocarDocente() {
        System.out.println("Informe o código da turma?");
        int idTurma = Integer.valueOf(input.nextLine());
        System.out.println("Informe o código do docente");
        int idDocente = Integer.valueOf(input.nextLine());

        servico.alocarDocente(idDocente, idTurma, turmas, docentes);

    }

    private void menuCadastroDocente() {
        System.out.println("Informe o nome do docente");
        String nome = input.nextLine();
        int id = servico.gerarCodigo(docentes);
        Docente d = new Docente(id, nome);

        servico.salvarDocente(d, docentes);
    }

    private void menuCadastroTurma() {
        System.out.println("Informe o nome da turma");
        String nome = input.nextLine();
        System.out.println("Informe a quantidade de alunos");
        int qtdAlunos = Integer.valueOf(input.nextLine());
        System.out.println("Informe a data de início (Formato: dd/MM/yyyy)");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse(input.nextLine(), dtf);
        String novoAssunto = "S";
        List<String> assuntos = new ArrayList<String>();
        while ("S".equalsIgnoreCase(novoAssunto)) {
            System.out.println("Informe uma disciplina");
            assuntos.add(input.nextLine());
            System.out.println("Cadastrar nova disciplina para esta Turma? (S/N)");
            novoAssunto = input.nextLine();
        }
        int id = servico.gerarCodigo(turmas);
        Turma t = new Turma(id, nome, qtdAlunos, dataInicio);
        t.setAssuntos(assuntos);

        servico.salvarTurma(t, turmas);

        iniciar();
    }

}
