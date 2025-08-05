package Exercicio02;

public class contaBancaria {
    protected String titular;
    protected double saldo;

    public contaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saque não permitido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$" + saldo);
    }
}
