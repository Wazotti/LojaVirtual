package Exercicio01;

public class Aviao extends Veiculo {
    private String companhiaAerea;

    public Aviao(String marca, int ano, String companhiaAerea) {
        super(marca, ano);
        this.companhiaAerea = companhiaAerea;

    }

    @Override
    public String detalhes() {
        return "Marca: " + marca + ", Ano: " + ano + ", Companhia Aérea: " + companhiaAerea;
    }
}
