package main.java.set.ordenacao.teste;

import main.java.set.ordenacao.dominio.GerenciadorAlunos;

public class GerenciadorAlunosTeste {
    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno D", "123-43", 7.9);
        gerenciadorAlunos.adicionarAluno("Aluno F", "432-34", 8.9);
        gerenciadorAlunos.adicionarAluno("Aluno G", "234-65", 6.5);
        gerenciadorAlunos.adicionarAluno("Aluno B", "766-87", 9.7);
        gerenciadorAlunos.adicionarAluno("Aluno K", "565-23", 7.8);
        gerenciadorAlunos.adicionarAluno("Aluno M", "543-32", 9.1);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("---------------");
        gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println("----------------");
        gerenciadorAlunos.exibirAlunosPorNota();

        System.out.println("-----------------");
        gerenciadorAlunos.removerAluno("234-65");
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
