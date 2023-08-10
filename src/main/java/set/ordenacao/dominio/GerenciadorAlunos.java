package main.java.set.ordenacao.dominio;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "GerenciadorAlunos{" +
                "alunoSet=" + alunoSet +
                '}';
    }

    public void adicionarAluno(String nome, String matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(String matricula) {
        alunoSet.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    public void exibirAlunosPorNome() {
        alunoSet.stream().sorted(Comparator.comparing(Aluno::getNome)).forEach(System.out::println);
    }

    public void exibirAlunosPorNota() {
        alunoSet.stream().sorted(Comparator.comparing(Aluno::getNota)).forEach(System.out::println);
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }
}
