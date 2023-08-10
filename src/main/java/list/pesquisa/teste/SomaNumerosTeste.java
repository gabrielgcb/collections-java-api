package main.java.list.pesquisa.teste;

import main.java.list.pesquisa.dominio.SomaNumeros;

public class SomaNumerosTeste {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.encontrarMaiorNumero());

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(32);
        somaNumeros.adicionarNumero(43);
        somaNumeros.adicionarNumero(433);
        somaNumeros.adicionarNumero(4);

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.calcularSoma());
    }
}
