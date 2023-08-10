package main.java.list.pesquisa.dominio;

import java.util.*;

public class SomaNumeros {
    List<Integer> inteiros;

    public SomaNumeros() {
        this.inteiros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "inteiros=" + inteiros +
                '}';
    }

    public void adicionarNumero(int numero) {
        inteiros.add(numero);
    }

    public int calcularSoma() {
        return inteiros.stream().reduce(0, Integer::sum);
    }

    public Integer encontrarMaiorNumero() {
        return inteiros.stream().max(Integer::compareTo).orElse(null);
    }

    public Integer encontrarMenorNumero() {
        return inteiros.stream().min((Integer::compareTo)).orElse(null);
    }

    public void exibirNumeros() {
        inteiros.forEach(integer -> System.out.print(integer + ", "));
    }

    public List<Integer> getInteiros() {
        return inteiros;
    }
}
