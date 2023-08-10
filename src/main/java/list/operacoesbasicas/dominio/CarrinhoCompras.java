package main.java.list.operacoesbasicas.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class CarrinhoCompras {
    private List<Item> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "itens=" + itens +
                '}';
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        itens.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        return itens.stream()
                .mapToDouble(value -> value.getQuantidade() * value.getPreco())
                .sum();
    }

    public void exibirItensCarrinho() {
        System.out.println(itens);
    }

    public List<Item> getItens() {
        return itens;
    }
}
