package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double nota) {
        alunosSet.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(long matricula) {
        // Instanciando variável para remover um aluno
        Aluno alunoParaRemover = null;
        // Buscando na lista de alunos o aluno com a matricula igual a matricula passada
        for(Aluno a : alunosSet) {
            if(a.getMatricula() == matricula) {
                // Atribuindo o aluno com a matricula igual a passada para ser removido
                alunoParaRemover = a;
            }
        }
        // Removendo o aluno com a matricula passada
        alunosSet.remove(alunoParaRemover);
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public void exibirAlunosPorNome() {
        // Utilizando o Comparable para ordenar os alunos por nome
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        // Utilizando o Comparator para ordenar os alunos por nota
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        System.out.println(alunosPorNota);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno(1, "Joao", 10);
        gerenciadorAlunos.adicionarAluno(2, "Marcelo", 8);
        gerenciadorAlunos.adicionarAluno(2, "Rodrigo", 5);
        gerenciadorAlunos.adicionarAluno(3, "Carlos", 9);
        gerenciadorAlunos.adicionarAluno(3, "Jose", 3);

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

        gerenciadorAlunos.removerAluno(2);
        gerenciadorAlunos.exibirAlunos();
    }
}
