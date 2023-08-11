package main.java.map.ordenacao.dominio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    @Override
    public String toString() {
        return "AgendaEventos{" +
                "agendaEventosMap=" + agendaEventosMap +
                '}';
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao) {
        agendaEventosMap.put(date, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventoTreeMap);
//        agendaEventosMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
//        agendaEventosMap.keySet()
//                .stream()
//                .sorted()
//                .forEach(localDate -> System.out.println(localDate + " " + agendaEventosMap.get(localDate)));
    }

    public Map<LocalDate, Evento> obterProximoEvento() {
        Map<LocalDate, Evento> proximoEvento = new HashMap<>();
        LocalDate dataLimite = LocalDate.of(2023, 8, 11);
        for(Map.Entry<LocalDate, Evento> entry : agendaEventosMap.entrySet()) {
            if(entry.getKey().isAfter(dataLimite)) {
                proximoEvento.put(entry.getKey(), entry.getValue());
                break;
            }
        }
        return proximoEvento.isEmpty() ? null : proximoEvento;
    }
}
