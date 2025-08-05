package Exercicio04;

class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salario, int cargaHoraria, double totalVendas) {
        super(nome, salario, cargaHoraria);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        double comissao = totalVendas * 0.05;  // 5% de comissão
        return super.calcularSalario() + comissao;
    }
}
