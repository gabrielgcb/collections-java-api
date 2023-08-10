package main.java.list.ordenacao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoPessoas{
    private List<Pessoa> listPessoa;

    public OrdenacaoPessoas() {
        this.listPessoa = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "listPessoa=" + listPessoa +
                '}';
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        listPessoa.sort(Comparator.comparing(Pessoa::getIdade));
    }

    public List<Pessoa> ordenarPorIdade2() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
//        return listPessoa.stream().sorted(Pessoa::compareTo).collect(Collectors.toList());
    }

    public void ordenarPorAltura() {
        listPessoa.sort(Comparator.comparing(Pessoa::getAltura));
    }

    public List<Pessoa> ordenarPorAltura2() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listPessoa);
        pessoaPorAltura.sort(new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public List<Pessoa> getListPessoa() {
        return listPessoa;
    }

}
