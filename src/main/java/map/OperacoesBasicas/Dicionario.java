package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if(!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Sangue", "Tudo começa pelo Sangue. O Sangue é o fluxo que banha a eternidade do Outro Lado.");
        dicionario.adicionarPalavra("Morte", "Tudo tem um começo e um fim, e o Tempo leva todas as coisas. Nada que é levado pela Morte pode voltar ao que era antes.");
        dicionario.adicionarPalavra("Conhecimento", "Saber tudo é perder tudo.");
        dicionario.adicionarPalavra("Energia", "O Caos é inevitável.");
        dicionario.adicionarPalavra("Medo", "O Medo é infinito.");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Conhecimento"));

        dicionario.removerPalavra("Sangue");
        dicionario.exibirPalavras();
    }
}
