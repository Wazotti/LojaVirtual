package Exercicio04;

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, int cargaHoraria, double bonus) {
        super(nome, salario, cargaHoraria);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}
