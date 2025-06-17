import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int total = 0;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                total += numero;
            }
        }
        return total;
    }

    public Integer encontrarMaiorNumero() {
        if(!numeros.isEmpty()) {
            int maiorNumero = numeros.get(0);
            for (Integer numero : numeros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }
        return null;
    }

    public Integer encontrarMenorNumero() {
        if(!numeros.isEmpty()) {
            int menorNumero = numeros.get(0);
            for (Integer numero : numeros) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }
        return null;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(3);

        numeros.exibirNumeros();

        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());

        System.out.println(numeros.calcularSoma());
    }
}
