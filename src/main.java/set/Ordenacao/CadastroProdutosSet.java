import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutosSet {
    private Set<ProdutoSet> produtoSet;

    public CadastroProdutosSet() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new ProdutoSet(codigo, nome, preco, quantidade));
    }

    public Set<ProdutoSet> exibirProdutosPorNome() {
        Set<ProdutoSet> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<ProdutoSet> exibirProdutosPorPreco() {
        Set<ProdutoSet> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<ProdutoSet> exibirProdutosPorQuantidade() {
        Set<ProdutoSet> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {
        CadastroProdutosSet cadastroProdutosSet = new CadastroProdutosSet();
        // System.out.println(cadastroProdutosSet.produtoSet);

        cadastroProdutosSet.adicionarProduto(1, "Camiseta", 25, 100);
        cadastroProdutosSet.adicionarProduto(2, "Shorts", 45, 60);
        cadastroProdutosSet.adicionarProduto(1, "Bota", 120, 20);
        cadastroProdutosSet.adicionarProduto(2, "Calça", 70, 40);
        cadastroProdutosSet.adicionarProduto(3, "Moletom", 100, 50);
        // System.out.println(cadastroProdutosSet.produtoSet);

        System.out.println(cadastroProdutosSet.exibirProdutosPorNome());
        System.out.println(cadastroProdutosSet.exibirProdutosPorPreco());
        System.out.println(cadastroProdutosSet.exibirProdutosPorQuantidade());
    }
}
