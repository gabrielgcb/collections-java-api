package main.java.map.pesquisa.teste;

import main.java.map.pesquisa.dominio.EstoqueProdutos;

public class EstoqueProdutosTeste {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();
        estoqueProdutos.adicionarProduto(123, "produto 1", 12, 3590.90);
        estoqueProdutos.adicionarProduto(432, "produto 2", 8, 234.87);
        estoqueProdutos.adicionarProduto(534, "produto 3", 90, 543);
        estoqueProdutos.adicionarProduto(645, "produto 4", 19, 78);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
