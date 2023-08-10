package main.java.set.ordenacao.dominio;

import main.java.list.ordenacao.dominio.Pessoa;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "CadastroProdutos{" +
                "produtoSet=" + produtoSet +
                '}';
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        System.out.println(produtoPorNome);
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        System.out.println(produtoPorPreco);
    }
}
