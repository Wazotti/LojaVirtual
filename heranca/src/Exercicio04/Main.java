package Exercicio04;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Lucas", 25.0, 160);
        Gerente g = new Gerente("Ana", 40.0, 160, 2000.0);
        Vendedor v = new Vendedor("Bruno", 20.0, 160, 10000.0);

        System.out.println("Salário do Funcionário: R$" + f.calcularSalario());
        System.out.println("Salário do Gerente: R$" + g.calcularSalario());
        System.out.println("Salário do Vendedor: R$" + v.calcularSalario());
    }
}
