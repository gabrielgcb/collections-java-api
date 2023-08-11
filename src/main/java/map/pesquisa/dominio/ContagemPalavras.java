package main.java.map.pesquisa.dominio;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    @Override
    public String toString() {
        return "ContagemPalavras{" +
                "contagemPalavrasMap=" + contagemPalavrasMap +
                '}';
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();
        int maisFrequente = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if(entry.getValue() > maisFrequente) {
                palavraMaisFrequente.clear();
                palavraMaisFrequente.put(entry.getKey(), entry.getValue());
                maisFrequente = entry.getValue();
            }
        }
        return palavraMaisFrequente;
    }
}
