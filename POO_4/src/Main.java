package app;

import model.Caminhao;
import model.CarroPasseio;

public class Main {
    public static void main(String[] args) {

        // --- Criação com dados válidos ---
        try {
            Caminhao caminhao = new Caminhao("ABC1234", "Volvo", 500.00, 2015, 250000.00, 20.0);
            System.out.println(caminhao);
            System.out.println("Locação (15 ton, 5 dias): R$" +
                    String.format("%.2f", caminhao.alugarVeiculo(15, 5)));
            System.out.println("Locação com sobrecarga (25 ton, 5 dias): R$" +
                    String.format("%.2f", caminhao.alugarVeiculo(25, 5)));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar caminhão: " + e.getMessage());
        }

        System.out.println("----------");

        try {
            CarroPasseio carro = new CarroPasseio("XYZ5678", "Toyota", 150.00, 2000, 40000.00);
            System.out.println(carro);
            System.out.println("Locação (3 dias): R$" +
                    String.format("%.2f", carro.alugarVeiculo(0, 3)));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar carro: " + e.getMessage());
        }

        System.out.println("----------");

        // --- Testes de exceção ---
        try {
            Caminhao invalido = new Caminhao("", "Ford", 300.00, 2010, 100000.00, 10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            CarroPasseio invalido = new CarroPasseio("DEF9999", "Honda", -100.00, 2020, 50000.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            Caminhao caminhao2 = new Caminhao("GHI1111", "Scania", 400.00, 2010, 200000.00, 15.0);
            caminhao2.alugarVeiculo(-5, 3); // peso negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}