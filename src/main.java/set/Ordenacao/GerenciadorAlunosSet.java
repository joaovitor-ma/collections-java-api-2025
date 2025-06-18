import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunosSet {
    private Set<AlunoSet> alunosSet;

    public GerenciadorAlunosSet() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double nota) {
        alunosSet.add(new AlunoSet(matricula, nome, nota));
    }

    public void removerAluno(long matricula) {
        // Instanciando variável para remover um aluno
        AlunoSet alunoParaRemover = null;
        // Buscando na lista de alunos o aluno com a matricula igual a matricula passada
        for(AlunoSet a : alunosSet) {
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
        Set<AlunoSet> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        // Utilizando o Comparator para ordenar os alunos por nota
        Set<AlunoSet> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        System.out.println(alunosPorNota);
    }

    public static void main(String[] args) {
        GerenciadorAlunosSet gerenciadorAlunosSet = new GerenciadorAlunosSet();

        gerenciadorAlunosSet.adicionarAluno(1, "Joao", 10);
        gerenciadorAlunosSet.adicionarAluno(2, "Marcelo", 8);
        gerenciadorAlunosSet.adicionarAluno(2, "Rodrigo", 5);
        gerenciadorAlunosSet.adicionarAluno(3, "Carlos", 9);
        gerenciadorAlunosSet.adicionarAluno(3, "Jose", 3);

        gerenciadorAlunosSet.exibirAlunos();
        gerenciadorAlunosSet.exibirAlunosPorNome();
        gerenciadorAlunosSet.exibirAlunosPorNota();

        gerenciadorAlunosSet.removerAluno(2);
        gerenciadorAlunosSet.exibirAlunos();
    }
}
