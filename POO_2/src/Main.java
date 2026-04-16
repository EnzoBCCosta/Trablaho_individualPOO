import java.util.Scanner;

// 2. Classe Principal para rodar o menu
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("AO CRIAR UMA NOVA CONTA DIGITE SEU NOME:");
        String nome_titular = sc.nextLine();
        ContaBancaria minhaConta = new ContaBancaria(123, nome_titular);


        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. VER SALDO \n2. DEPOSITAR \n3. SACAR \n0. SAIR ");
            System.out.println("--------------");
            System.out.print("DIGITE UMA OPÇÃO: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nSaldo atual: R$" + minhaConta.saldo);
                    break;

                case 2:
                    System.out.print("VALOR DO DEPOSITO: ");
                    double dep = sc.nextDouble();
                    minhaConta.depositar(dep);
                    break;

                case 3:
                    System.out.print("VALOR DO SAQUE: ");
                    double saq = sc.nextDouble();
                    minhaConta.sacar(saq);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}