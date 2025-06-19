package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefa;

    public ListaTarefas() {
        this.tarefa = new HashSet<>();
    }

    public void adicionarTarefa(String tarefa, boolean concluido) {
        this.tarefa.add(new Tarefa(tarefa, concluido));
    }

    public void removerTarefa(String tarefa) {
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : this.tarefa) {
            if(t.getDescricao().equals(tarefa)) {
                tarefaParaRemover = t;
            }
        }
        this.tarefa.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefa);
    }

    public void contarTarefas() {
        System.out.println(tarefa.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefa) {
            if(t.isConcluido() == true) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefa) {
            if(t.isConcluido() == false) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : tarefa) {
            if(t.getDescricao().equals(descricao)) {
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa t : tarefa) {
            if(t.getDescricao().equals(descricao)) {
                t.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefa.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1", true);
        listaTarefas.adicionarTarefa("Tarefa 2", false);
        listaTarefas.adicionarTarefa("Tarefa 3", true);
        listaTarefas.adicionarTarefa("Tarefa 4", false);
        listaTarefas.adicionarTarefa("Tarefa 5", true);

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        
        listaTarefas.marcarTarefaConcluida("Tarefa 4");
        System.out.println(listaTarefas.obterTarefasPendentes());
        
        listaTarefas.marcarTarefaPendente("Tarefa 1");
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.exibirTarefas();
    }
}
