package main.java.set.Ordenacao;

import java.util.Comparator;

public class ProdutoSet implements Comparable<ProdutoSet> {
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;
    
    public ProdutoSet(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(ProdutoSet p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ProdutoSet [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProdutoSet other = (ProdutoSet) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }    
}

class ComparatorPorPreco implements Comparator<ProdutoSet> {

    @Override
    public int compare(ProdutoSet p1, ProdutoSet p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}

class ComparatorPorQuantidade implements Comparator<ProdutoSet> {

    @Override
    public int compare(ProdutoSet p1, ProdutoSet p2) {
        return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
    }
    
}
