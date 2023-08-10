package main.java.set.ordenacao.teste;

import main.java.set.ordenacao.dominio.CadastroProdutos;

public class CadastroProdutosTeste {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Camisa social", 11, 359.90, 50);
        cadastroProdutos.adicionarProduto("Calça ", 22, 123, 32);
        cadastroProdutos.adicionarProduto("Tênis esportivo", 33, 80, 30);
        cadastroProdutos.adicionarProduto("Blusa", 88, 169, 56);
        cadastroProdutos.adicionarProduto("Sapato social", 55, 84, 23);
        cadastroProdutos.adicionarProduto("Chuteira", 44, 433, 76);

        cadastroProdutos.exibirProdutosPorNome();

        System.out.println("-----------------------------------");

        cadastroProdutos.exibirProdutosPorPreco();
    }
}
