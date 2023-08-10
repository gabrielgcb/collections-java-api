package main.java.set.pesquisa.teste;

import main.java.set.pesquisa.dominio.AgendaContatos;

public class AgendaContatosTeste {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João Gabriel Bispo", "(62)98457-4512");
        agendaContatos.adicionarContato("Gabriel Guimarães", "(62)98457-5656");
        agendaContatos.adicionarContato("Gabriel Cordeiro", "(62)98457-5454");
        agendaContatos.adicionarContato("Lucas", "(62)98457-4513");
        agendaContatos.adicionarContato("João", "(62)98457-4514");

        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("joão", "1111111111");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));
        System.out.println(agendaContatos.pesquisarPorNome("João"));

    }
}
