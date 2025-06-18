package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O Nome do Vento", "Patrick Rothfuss", 2007);
        catalogoLivros.adicionarLivro("O Temor do Sábio", "Patrick Rothfuss", 2011);
        catalogoLivros.adicionarLivro("As Portas de Pedra", "Patrick Rothfuss", 2025);

        System.out.println(catalogoLivros.pesquisarPorAutor("Patrick Rothfuss"));
        
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(2000, 2015));

        System.out.println(catalogoLivros.pesquisarPorTitulo("o nome do vento"));
    }
}
