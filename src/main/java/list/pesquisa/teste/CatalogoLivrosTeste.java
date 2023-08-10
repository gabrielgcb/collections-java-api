package main.java.list.pesquisa.teste;

import main.java.list.pesquisa.dominio.CatalogoLivros;
import main.java.list.pesquisa.dominio.Livro;

public class CatalogoLivrosTeste {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Os miseráveis", "Victor Hugo", 1862);
        catalogoLivros.adicionarLivro("Jogos vorazes", "Lucas", 2002);
        catalogoLivros.adicionarLivro("Percy Jackson", "Ana Belle", 1987);
        catalogoLivros.adicionarLivro("O homem que calculava", "Malba Tahan", 1908);
        catalogoLivros.adicionarLivro("Código da Vinci", "Leonardo", 1789);
        catalogoLivros.adicionarLivro("Os três mosqueteiros", "Victor Hugo", 1856);

        for(Livro livro : catalogoLivros.getLivros()) {
            System.out.println(livro);
        }
        System.out.println("----------------------------------");

        System.out.println(catalogoLivros.pesquisaPorTitulo("Percy Jackson"));
        System.out.println("----------------------------------");

        System.out.println(catalogoLivros.pesquisarPorAutor("Victor Hugo"));
        System.out.println("----------------------------------");

        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1857, 1990));
        System.out.println("----------------------------------");

        long init = System.currentTimeMillis();
        catalogoLivros.pesquisaPorIntervaloAnos(1850, 1920);
        long end = System.currentTimeMillis();

        System.out.println("time spent = " + (end - init) + "ms");


    }
}
