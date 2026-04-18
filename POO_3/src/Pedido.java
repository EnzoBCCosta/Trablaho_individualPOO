import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        this.itens.add(item);
    }

    private double calcularTotalItens() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void fecharPedido() {
        double totalItens = calcularTotalItens();
        double frete = (totalItens > 250.0) ? 0.0 : 25.0;
        double totalFinal = totalItens + frete;

        // Impressão do Recibo Detalhado
        System.out.println("---------- RECIBO DE COMPRA ----------");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Itens:");
        for (ItemPedido item : itens) {
            System.out.println(" - " + item.getDetalhes());
        }
        System.out.println("--------------------------------------");
        System.out.printf("Subtotal: R$ %.2f\n", totalItens);
        System.out.printf("Frete: %s\n", (frete == 0 ? "GRÁTIS" : "R$ " + frete));
        System.out.printf("TOTAL FINAL: R$ %.2f\n", totalFinal);
        System.out.println("--------------------------------------");

    }
}
