package Exercicio02;

class contaCorrente extends contaBancaria {
    private double limiteChequeEspecial;

    public contaCorrente(String titular, double saldoInicial, double limiteChequeEspecial) {
        super(titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado (com cheque especial se necessário).");
        } else {
            System.out.println("Saque não permitido. Limite excedido.");
        }
    }
}