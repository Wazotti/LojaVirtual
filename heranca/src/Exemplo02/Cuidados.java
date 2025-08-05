package Exemplo02;

public class Cuidados {
    private String tipoSolo;
    private double qtdAgua;
    private double temperaturIdeal;

    public Cuidados(String tipoSolo, double qtdAgua, double temperaturIdeal) {
        this.tipoSolo = tipoSolo;
        this.qtdAgua = qtdAgua;
        this.temperaturIdeal = temperaturIdeal;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public double getQtdAgua() {
        return qtdAgua;
    }

    public void setQtdAgua(double qtdAgua) {
        this.qtdAgua = qtdAgua;
    }

    public double getTemperaturIdeal() {
        return temperaturIdeal;
    }

    public void setTemperaturIdeal(double temperaturIdeal) {
        this.temperaturIdeal = temperaturIdeal;
    }
}
