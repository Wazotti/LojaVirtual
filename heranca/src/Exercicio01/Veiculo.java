package Exercicio01;

public class Veiculo {
    protected String marca;
    protected int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public Veiculo() {
    }

    public String detalhes() {
        return "Marca: " + marca + ", Ano: " + ano;
    }
}
