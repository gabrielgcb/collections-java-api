package main.java.set.operacoesbasica.dominio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoConvidados{" +
                "convidadoList=" + convidadoSet +
                '}';
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        convidadoSet.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public Set<Convidado> getConvidadoSet() {
        return convidadoSet;
    }
}
