package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefa;

    public ListaTarefa() {
        this.tarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefa.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefa);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
