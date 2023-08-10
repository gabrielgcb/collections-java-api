package main.java.list.operacoesbasicas.teste;

import main.java.list.operacoesbasicas.dominio.CarrinhoCompras;
import main.java.list.operacoesbasicas.dominio.Item;

import java.util.List;

public class CarrinhoComprasTeste {
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        System.out.println(carrinhoCompras.calcularValorTotal());

        carrinhoCompras.exibirItensCarrinho();

        carrinhoCompras.adicionarItem("Bola de vôlei penalty", 100, 1);
        carrinhoCompras.adicionarItem("Camisa social preta", 200, 2);

        carrinhoCompras.exibirItensCarrinho();

        System.out.println(carrinhoCompras.calcularValorTotal());

    }
}
