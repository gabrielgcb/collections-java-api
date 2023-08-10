package main.java.list.ordenacao.teste;

import main.java.list.ordenacao.dominio.OrdenacaoPessoas;
import main.java.list.ordenacao.dominio.Pessoa;

import javax.swing.border.Border;
import java.util.function.Consumer;

public class OrdenacaoPessoasTeste {
    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Gabriel", 22, 1.75);
        ordenacaoPessoas.adicionarPessoa("Lucas", 18, 1.70);
        ordenacaoPessoas.adicionarPessoa("Lázaro", 62, 1.65);
        ordenacaoPessoas.adicionarPessoa("Glaucineia", 48, 1.68);

        ordenacaoPessoas.ordenarPorAltura();

        System.out.println(ordenacaoPessoas.ordenarPorIdade2());

        System.out.println(ordenacaoPessoas.ordenarPorAltura2());

        ordenacaoPessoas.getListPessoa().forEach(System.out::println);


    }
}
