import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<TarefaSet> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String tarefa, boolean concluido) {
        tarefaSet.add(new TarefaSet(tarefa, concluido));
    }

    public void removerTarefa(String tarefa) {
        TarefaSet tarefaParaRemover = null;
        for(TarefaSet t : tarefaSet) {
            if(t.getDescricao().equals(tarefa)) {
                tarefaParaRemover = t;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public Set<TarefaSet> obterTarefasConcluidas() {
        Set<TarefaSet> tarefasConcluidas = new HashSet<>();
        for(TarefaSet t : tarefaSet) {
            if(t.isConcluido() == true) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<TarefaSet> obterTarefasPendentes() {
        Set<TarefaSet> tarefasPendentes = new HashSet<>();
        for(TarefaSet t : tarefaSet) {
            if(t.isConcluido() == false) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(TarefaSet t : tarefaSet) {
            if(t.getDescricao().equals(descricao)) {
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(TarefaSet t : tarefaSet) {
            if(t.getDescricao().equals(descricao)) {
                t.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
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
