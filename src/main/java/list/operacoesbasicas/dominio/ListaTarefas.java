package main.java.list.operacoesbasicas.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListaTarefas {

    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "tarefas=" + tarefas +
                '}';
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterTotalDeTarefas() {
        return tarefas.size();
    }

    public List<String> obterDescricaoTarefas() {
        return tarefas.stream().map(Tarefa::getDescricao).collect(Collectors.toList());
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
