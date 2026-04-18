package model;

public final class Caminhao extends Veiculo {

    private final double capacidadeCargaToneladas;

    public Caminhao(String placa, String marca, double valorLocacaoDiaria,
                    int anoFabricacao, double precoFipe, double capacidadeCargaToneladas) {

        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);

        if (capacidadeCargaToneladas <= 0)
            throw new IllegalArgumentException("Capacidade de carga inválida!");

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (pesoCarga < 0)
            throw new IllegalArgumentException("Peso da carga não pode ser negativo!");
        if (dias <= 0)
            throw new IllegalArgumentException("Número de dias inválido!");

        double total = getValorLocacaoDiaria() * dias;
        if (pesoCarga > capacidadeCargaToneladas) {
            total += total * 0.10;
        }

        return total;
    }

    @Override
    public double calcularIpva() {
        if (isIsentoIpva()) return 0.0;
        return getPrecoFipe() * 0.015; // 1.5%
    }

    public double getCapacidadeCargaToneladas() { return capacidadeCargaToneladas; }

    @Override
    public String toString() {
        return super.toString() +
                "\nCapacidade: " + capacidadeCargaToneladas + " ton" +
                "\nIPVA: R$" + String.format("%.2f", calcularIpva());
    }
}