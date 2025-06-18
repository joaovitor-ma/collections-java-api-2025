package main.java.list.OperacoesBasicas;

public class TarefaList {
    private String descricao;

    public TarefaList(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }

}
