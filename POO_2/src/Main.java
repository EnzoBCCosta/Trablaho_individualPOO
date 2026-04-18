import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = null;
        try {
            System.out.println("AO CRIAR UMA NOVA CONTA DIGITE SEU NOME:");
            String nomeTitular = sc.nextLine();
            conta = new ContaBancaria(1111, nomeTitular);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar conta: " + e.getMessage());
            return;
        }

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. VER SALDO \n2. DEPOSITAR \n3. SACAR \n0. SAIR");
            System.out.println("--------------");
            System.out.print("DIGITE UMA OPÇÃO: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("\nSaldo atual: R$" + conta.saldo);
                    break;
                case 2:
                    System.out.print("VALOR DO DEPOSITO: ");
                    double dep = sc.nextDouble();
                    conta.depositar(dep);
                    break;
                case 3:
                    System.out.print("VALOR DO SAQUE: ");
                    double saq = sc.nextDouble();
                    conta.sacar(saq);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}