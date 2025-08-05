package Exemplo02;

public class Planta {
    private int id;
    private String nomeCientifico;
    private String fruto;
    private String habitat;
    private String reproducao;
    private boolean medicinal;
    private String origem;
    private Cuidados cuidados;

    public Planta(int id, String nomeCientifico, String fruto, String habitat, String reproducao, boolean medicinal, String origem) {
        this.id = id;
        this.nomeCientifico = nomeCientifico;
        this.fruto = fruto;
        this.habitat = habitat;
        this.reproducao = reproducao;
        this.medicinal = medicinal;
        this.origem = origem;
    }

    public void mostrar(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getFruto() {
        return fruto;
    }

    public void setFruto(String fruto) {
        this.fruto = fruto;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getReproducao() {
        return reproducao;
    }

    public void setReproducao(String reproducao) {
        this.reproducao = reproducao;
    }

    public boolean isMedicinal() {
        return medicinal;
    }

    public void setMedicinal(boolean medicinal) {
        this.medicinal = medicinal;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
