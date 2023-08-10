package main.java.list.operacoesbasicas.teste;

import main.java.list.operacoesbasicas.dominio.ListaTarefas;
import main.java.list.operacoesbasicas.dominio.Tarefa;

public class ListaTarefasTeste {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(listaTarefas.obterTotalDeTarefas());

        listaTarefas.adicionarTarefa("lavar os tênis");
        listaTarefas.adicionarTarefa("ir ao supermercado");
        listaTarefas.adicionarTarefa("treino de volei às 20:30h");
        listaTarefas.adicionarTarefa("fazer compras");
        listaTarefas.adicionarTarefa("fazer compras");
        listaTarefas.adicionarTarefa("fazer compras");

        System.out.println("total de tarefas: " + listaTarefas.obterTotalDeTarefas());

        for(Tarefa tarefa : listaTarefas.getTarefas()) {
            System.out.println(tarefa);
        }
        System.out.println("----------------------------");

        listaTarefas.removerTarefa("fazer compras");
        for(Tarefa tarefa : listaTarefas.getTarefas()) {
            System.out.println(tarefa);
        }
        System.out.println("------------------------------");

        System.out.println("total de tarefas: " + listaTarefas.obterTotalDeTarefas());

        System.out.println("------------------------------");

        listaTarefas.obterDescricaoTarefas().forEach(System.out::println);

    }
}
