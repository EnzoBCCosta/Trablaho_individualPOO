package model;

import service.Fretavel;
import service.Tributavel;
import java.time.LocalDate;

public abstract sealed class Veiculo implements Fretavel, Tributavel
        permits Caminhao, CarroPasseio {

    private final String placa;
    private final String marca;
    private double valorLocacaoDiaria;
    private final int anoFabricacao;
    private double precoFipe;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria,
                   int anoFabricacao, double precoFipe) {

        if (placa == null || placa.isBlank())
            throw new IllegalArgumentException("Placa inválida!");
        if (marca == null || marca.isBlank())
            throw new IllegalArgumentException("Marca inválida!");
        if (valorLocacaoDiaria <= 0)
            throw new IllegalArgumentException("Valor de locação diária inválido!");
        if (anoFabricacao < 1886 || anoFabricacao > LocalDate.now().getYear())
            throw new IllegalArgumentException("Ano de fabricação inválido!");
        if (precoFipe <= 0)
            throw new IllegalArgumentException("Preço FIPE inválido!");

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }

    protected boolean isIsentoIpva() {
        int anoAtual = LocalDate.now().getYear();
        return (anoAtual - anoFabricacao) > 20;
    }

    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public double getValorLocacaoDiaria() { return valorLocacaoDiaria; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public double getPrecoFipe() { return precoFipe; }

    public void setValorLocacaoDiaria(double valorLocacaoDiaria) {
        if (valorLocacaoDiaria <= 0)
            throw new IllegalArgumentException("Valor de locação diária inválido!");
        this.valorLocacaoDiaria = valorLocacaoDiaria;
    }

    public void setPrecoFipe(double precoFipe) {
        if (precoFipe <= 0)
            throw new IllegalArgumentException("Preço FIPE inválido!");
        this.precoFipe = precoFipe;
    }

    @Override
    public String toString() {
        return "Placa: " + placa +
                "\nMarca: " + marca +
                "\nAno: " + anoFabricacao +
                "\nDiária: R$" + String.format("%.2f", valorLocacaoDiaria) +
                "\nFIPE: R$" + String.format("%.2f", precoFipe);
    }
}