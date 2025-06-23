package main.java.map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> catalogo;

    public LivrariaOnline() {
        this.catalogo = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        catalogo.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String link) {
        catalogo.remove(link);
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(catalogo.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new TreeMap<>();
        if(!catalogo.isEmpty()) {
            for(Map.Entry<String, Livro> entry : catalogo.entrySet()) {
                if(entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        Double precoLivro = Double.MIN_VALUE;
        for(Livro l : catalogo.values()) {
            if(l.getPreco() > precoLivro) {
                precoLivro = l.getPreco();
                livroMaisCaro = l;
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        Double precoLivro = Double.MAX_VALUE;
        for(Livro l : catalogo.values()) {
            if(l.getPreco() < precoLivro) {
                precoLivro = l.getPreco();
                livroMaisBarato = l;
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://a.co/d/2Na4AeE", "O nome do vento (A Crônica do Matador do Rei – Livro 1)", "Patrick Rothfuss", 55.93);
        livrariaOnline.adicionarLivro("https://a.co/d/6Tk3PkY", "O temor do sábio (A Crônica do Matador do Rei – Livro 2)", "Patrick Rothfuss", 71.19);
        livrariaOnline.adicionarLivro("https://a.co/d/8QIkELL", "O aprendiz de assassino: 1", "Robin Hobb", 49.90);

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("patrick rothfuss"));
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("robin hobb"));

        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println(livrariaOnline.obterLivroMaisBarato());
    }
}
