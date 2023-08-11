package main.java.map.ordenacao.teste;

import main.java.map.ordenacao.dominio.AgendaEventos;

import java.time.LocalDate;

public class AgendaEventosTeste {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, 5, 31), "Festividade", "Fernandinho");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 6, 25), "Umadeb", "Nívea Soares");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 14), "Umadego", "Talles Roberto");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 21), "Umadecre", "Cassiane");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 12), "Marcha para Jesus", "Aline Barros");

        //agendaEventos.exibirAgenda();
        System.out.println(agendaEventos.obterProximoEvento());

    }
}
