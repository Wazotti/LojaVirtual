package Exercicio04;

public class Funcionario {
    protected String nome;
    protected double salario;
    protected int cargaHoraria;

    public Funcionario(String nome, double salario, int cargaHoraria) {
        this.nome = nome;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularSalario() {
        return salario * cargaHoraria;
    }
}
