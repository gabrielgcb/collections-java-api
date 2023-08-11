package main.java.map.pesquisa.teste;

import main.java.map.pesquisa.dominio.ContagemPalavras;

public class ContagemPalavrasTeste {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Gabriel", 10);
        contagemPalavras.adicionarPalavra("Lucas", 5);
        contagemPalavras.adicionarPalavra("Davi", 20);
        contagemPalavras.adicionarPalavra("João", 30);
        contagemPalavras.adicionarPalavra("José", 15);

        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("José");
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
