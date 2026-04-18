public class ItemPedido {
    private String nomeProduto;
    private double precoUnidade;
    private int quantidade;

    public ItemPedido(String nomeProduto, double precoUnidade, int quantidade){
        this.nomeProduto = nomeProduto;
        this.precoUnidade = precoUnidade;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return precoUnidade * quantidade;
    }
    public String getDetalhes() {
        return String.format("%s (x%d) - R$ %.2f", nomeProduto, quantidade, getSubtotal());
    }
}
