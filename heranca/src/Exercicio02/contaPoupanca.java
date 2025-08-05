package Exercicio02;

class contaPoupanca extends contaBancaria {
    private double taxaJuros;

    public contaPoupanca(String titular, double saldoInicial, double taxaJuros) {
        super(titular, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double juros = saldo * taxaJuros;
        saldo += juros;
        System.out.println("Juros de R$" + juros + " aplicados.");
    }
}
