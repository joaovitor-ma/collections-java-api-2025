package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produto;

    public CadastroProdutos() {
        this.produto = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produto.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produto);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produto);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produto);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        // System.out.println(cadastroProdutosSet.produtoSet);

        cadastroProdutos.adicionarProduto(1, "Camiseta", 25, 100);
        cadastroProdutos.adicionarProduto(2, "Shorts", 45, 60);
        cadastroProdutos.adicionarProduto(1, "Bota", 120, 20);
        cadastroProdutos.adicionarProduto(2, "Calça", 70, 40);
        cadastroProdutos.adicionarProduto(3, "Moletom", 100, 50);
        // System.out.println(cadastroProdutosSet.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());
    }
}
