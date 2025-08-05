package Exercicio02;

public class Main {
    public static void main(String[] args) {

        contaCorrente cc = new contaCorrente("Maria", 500.0, 200.0);
        cc.consultarSaldo();
        cc.sacar(600.0);
        cc.depositar(100.0);
        cc.sacar(300.0);
        cc.consultarSaldo();

        System.out.println("------------------------");

        contaPoupanca cp = new contaPoupanca("João", 1000.0, 0.05);
        cp.consultarSaldo();
        cp.aplicarJuros();
        cp.consultarSaldo();
        cp.sacar(200.0);
        cp.consultarSaldo();
    }
}
