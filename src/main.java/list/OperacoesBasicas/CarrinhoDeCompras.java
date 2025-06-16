import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaItemsParaRemover = new ArrayList<>();

        for (Item item : carrinhoDeCompras) {
            if(item.getNome().equalsIgnoreCase(nome)) {
                listaItemsParaRemover.add(item);
            }
        }

        carrinhoDeCompras.removeAll(listaItemsParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (Item item : carrinhoDeCompras) {
            valorTotal += (item.getPreco() * item.getQuantidade());
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Camiseta branca", 20, 1);
        carrinho.adicionarItem("Camiseta preta", 20, 4);
        carrinho.adicionarItem("Moletom com ziper", 80, 1);
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
        
        carrinho.removerItem("camiseta branca");
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
        
        carrinho.removerItem("camiseta preta");
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
    }
}
