package main.java.set.operacoesbasica.teste;

import main.java.set.operacoesbasica.dominio.ConjuntoConvidados;

public class ConjuntoConvidadosTeste {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 111);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 222);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 333);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 444);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 444);

        conjuntoConvidados.exibirConvidados();

        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);

        conjuntoConvidados.exibirConvidados();
    }
}
