package main.java.map.pesquisa.dominio;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class EstoqueProdutos {
    private Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    @Override
    public String toString() {
        return "EstoqueProdutos{" +
                "produtoMap=" + produtoMap +
                '}';
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        produtoMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque() {
        return produtoMap.values()
                .stream()
                .mapToDouble(produto -> produto.getPreco() * produto.getQuantidade())
                .sum();
//        double valorTotal = 0;
//        for(Produto produto : produtoMap.values()) {
//            valorTotal += produto.getPreco() * produto.getQuantidade();
//        }
//        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        return produtoMap.values()
                .stream()
                .max(Comparator.comparing(Produto::getPreco))
                .orElse(null);
    }

    public Produto obterProdutoMaisBarato() {
        return produtoMap.values()
                .stream()
                .min(Comparator.comparing(Produto::getPreco))
                .orElse(null);
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        return produtoMap.values()
                .stream()
                .max(Comparator.comparing(produto -> produto.getQuantidade() * produto.getPreco()))
                .orElse(null);
//        Produto produtoMaiorValorEstoque = null;
//        double maiorValor = Double.MIN_VALUE;
//        for(Produto produto : produtoMap.values()) {
//            if(produto.getQuantidade() * produto.getPreco() > maiorValor) {
//                produtoMaiorValorEstoque = produto;
//                maiorValor = produto.getQuantidade() * produto.getPreco();
//            }
//        }
//        return produtoMaiorValorEstoque;
    }

}




