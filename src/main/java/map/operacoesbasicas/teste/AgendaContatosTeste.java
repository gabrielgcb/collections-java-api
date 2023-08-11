package main.java.map.operacoesbasicas.teste;

import main.java.map.operacoesbasicas.dominio.AgendaContatos;

public class AgendaContatosTeste {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Gabriel", "(62)97654-4567");
        agendaContatos.adicionarContato("Lucas", "(62)13443-42344");
        agendaContatos.adicionarContato("João", "(62)4356-5435");
        agendaContatos.adicionarContato("Robs", "(62)2343-6545");
        agendaContatos.adicionarContato("Honda", "(62)65466-5465");

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Lucas");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Robs"));
    }
}
