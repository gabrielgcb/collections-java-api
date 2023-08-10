package main.java.set.pesquisa.dominio;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatosSet=" + contatosSet +
                '}';
    }

    public void adicionarContato(String nome, String numeroTelefone) {
        contatosSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        return contatosSet.stream()
                .filter(contato -> contato.getNome().contains(nome))
                .collect(Collectors.toSet());
//        Set<Contato> contatosNome = new HashSet<>();
//        for(Contato contato : contatosSet) {
//            if(contato.getNome().contains(nome)) {
//                contatosNome.add(contato);
//            }
//        }
//        return contatosNome;
    }

    public void atualizarNumeroContato(String nome, String novoTelefone) {
        contatosSet.stream().filter(contato -> contato.getNome().equalsIgnoreCase(nome))
                .forEach(contato -> contato.setNumeroTelefone(novoTelefone));
    }

    public Set<Contato> getContatosSet() {
        return contatosSet;
    }
}
