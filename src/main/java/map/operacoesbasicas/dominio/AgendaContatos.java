package main.java.map.operacoesbasicas.dominio;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatosMap=" + contatosMap +
                '}';
    }

    public void adicionarContato(String nome, String telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        contatosMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(contatosMap);
    }

    public String pesquisarPorNome(String nome) {
        System.out.print("Telefone de " + nome + ": ");
        return contatosMap.get(nome);
    }
}
