package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> listaPalavras;

    public ConjuntoPalavrasUnicas() {
        this.listaPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        listaPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        if(!listaPalavras.isEmpty()) {
            for(String p : listaPalavras) {
                if(p.equalsIgnoreCase(palavra)) {
                    palavraParaRemover = p;
                }
            }
        }
        listaPalavras.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        if(!listaPalavras.isEmpty()) {
            for(String p : listaPalavras) {
                if(p.equalsIgnoreCase(palavra)) {
                    System.out.println("Esta palavra já está no conjunto");
                }
            }
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(listaPalavras);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [listaPalavras=" + listaPalavras + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listaPalavras == null) ? 0 : listaPalavras.hashCode());
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
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (listaPalavras == null) {
            if (other.listaPalavras != null)
                return false;
        } else if (!listaPalavras.equals(other.listaPalavras))
            return false;
        return true;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        
        conjuntoPalavrasUnicas.removerPalavra("palavra 3");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
