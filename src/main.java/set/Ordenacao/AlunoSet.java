import java.util.Comparator;

public class AlunoSet implements Comparable<AlunoSet> {
    // atributos
    private long matricula;
    private String nome;
    private double nota;

    public AlunoSet(long matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public int compareTo(AlunoSet p) {
        return nome.compareTo(p.getNome());
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "AlunoSet [matricula=" + matricula + ", nome=" + nome + ", nota=" + nota + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
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
        AlunoSet other = (AlunoSet) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }
}

class ComparatorPorNota implements Comparator<AlunoSet> {

    @Override
    public int compare(AlunoSet a1, AlunoSet a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
    
}
