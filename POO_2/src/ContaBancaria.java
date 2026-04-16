class ContaBancaria {
    public int numero;
    public String titular;
    public double saldo;
    public int saquesRealizados;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 50;
        this.saquesRealizados = 0;
        System.out.printf("Conta %d criada para %s. Bônus de R$50 aplicado!%n", numero, titular);
    }


    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saquesRealizados >= 3) {
            System.out.println("ERRO: Limite de 3 saques atingido.");
            return false;
        }
        if (valor > 1000) {
            System.out.println("ERRO: Limite máximo por saque é R$1000.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("ERRO: Saldo insuficiente.");
            return false;
        }

        this.saldo -= valor;
        this.saquesRealizados++;
        return true;
    }
}
