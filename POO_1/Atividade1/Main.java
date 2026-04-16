import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int saque_dia = 0;
        double saldo = 2000;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. VER SALDO \n2. DEPOSITAR \n3. SACAR \n0. SAIR ");
            System.out.println("--------------");
            System.out.print("DIGITE UMA OPÇÃO: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n============================");
                    System.out.println("Saldo atual:\nR$" + saldo);
                    System.out.println("============================");
                    break;

                case 2:
                    System.out.println("\n============================");
                    System.out.println("VALOR DO DEPOSITO DESEJADO:");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("============================");
                    break;

                case 3:
                    if (saque_dia < 3) {
                        System.out.println("\n============================");
                        System.out.println("DIGITE O SAQUE DESEJADO (Limite max.:1000):");
                        double saque = sc.nextDouble();

                        if (saque > 1000) {
                            System.out.println("ERRO: VALOR ACIMA DO MÁXIMO");
                        } else if (saque > saldo) {
                            System.out.println("ERRO: SALDO INSUFICIENTE");
                        } else {
                            System.out.printf("SAQUE DE R$%.2f REALIZADO!%n", saque);
                            saldo -= saque;
                            saque_dia++;
                        }
                        System.out.println("============================");
                    } else {
                        System.out.println("\n===========================");
                        System.out.println("Limite de saques diários atingido");
                        System.out.println("============================");
                    }
                    break;

                case 0:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("\n===========================");
                    System.out.println("\n Opção invalida!");
                    System.out.println(("==========================="));
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}