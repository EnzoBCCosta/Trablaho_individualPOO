package model;

public final class CarroPasseio extends Veiculo {

    public CarroPasseio(String placa, String marca, double valorLocacaoDiaria,
                        int anoFabricacao, double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (pesoCarga < 0)
            throw new IllegalArgumentException("Peso da carga não pode ser negativo!");
        if (dias <= 0)
            throw new IllegalArgumentException("Número de dias inválido!");
        return getValorLocacaoDiaria() * dias;
    }

    @Override
    public double calcularIpva() {
        if (isIsentoIpva()) return 0.0;
        return getPrecoFipe() * 0.04; // 4%
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nIPVA: R$" + String.format("%.2f", calcularIpva());
    }
}