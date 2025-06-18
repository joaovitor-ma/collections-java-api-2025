package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(listaNumeros);
    }

    public void ordenarDecrescente() {
        listaNumeros.sort((n1, n2) -> n2.compareTo(n1));
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros [listaNumeros=" + listaNumeros + "]";
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(3);

        System.out.println(ordenacaoNumeros);

        ordenacaoNumeros.ordenarAscendente();
        System.out.println(ordenacaoNumeros);
        
        ordenacaoNumeros.ordenarDecrescente();
        System.out.println(ordenacaoNumeros);
    }
}