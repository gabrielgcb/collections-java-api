package main.java.list.pesquisa.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "livros=" + livros +
                '}';
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        return livros.stream()
                .filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
//        List<Livro> listaAutor = new ArrayList<>();
//        for(Livro livro : livros) {
//            if(livro.getAutor().equalsIgnoreCase(autor)) {
//                listaAutor.add(livro);
//            }
//        }
//        return listaAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        return livros.stream()
                .filter(livro -> livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal)
                .collect(Collectors.toList());
    }

    public Livro pesquisaPorTitulo(String titulo) {
        return livros.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
