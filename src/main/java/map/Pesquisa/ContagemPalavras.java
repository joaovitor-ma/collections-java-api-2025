package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemMap);
    }

    public void encontrarPalavraMaisFrequente() {
        if(!contagemMap.isEmpty()) {
            String palavraMaisFrequente = null;
            Integer maiorContagem = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
                if(entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
            System.out.println("A palavra mais frequente é: "+palavraMaisFrequente+", ela aparece "+maiorContagem+" vezes.");
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Maior", 20);
        contagemPalavras.adicionarPalavra("Menor", 5);
        contagemPalavras.adicionarPalavra("Media", 10);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.encontrarPalavraMaisFrequente();

        contagemPalavras.removerPalavra("Maior");

        contagemPalavras.encontrarPalavraMaisFrequente();

        contagemPalavras.exibirContagemPalavras();
    }
}
