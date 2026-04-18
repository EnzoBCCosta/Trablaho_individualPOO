//Relacionamentos e Encapsulamento     Exercício: E-commerce (Cliente -> Pedido -> ItemPedido).
// Detalhes: Modelar um Pedido que pertence a um Cliente e contém uma Lista de ItemPedido.
// Regra de Negócio: - Calcular o Frete:
// Criar um metodo fecharPedido(). Se o valor total dos itens for superior a R$250,00, o frete é grátis.
//  Caso contrário, cobrar uma taxa fixa de R$25,00. Imprimir o recibo detalhado.

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Enzo");
        Pedido p1 = new Pedido(c1);

        p1.adicionarItem(new ItemPedido("Teclado Mecânico", 150.0, 1));
        p1.adicionarItem(new ItemPedido("Mouse Pad Gamer", 60.0, 2));

        p1.fecharPedido();
    }
}