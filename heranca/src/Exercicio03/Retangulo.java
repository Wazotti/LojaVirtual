package Exercicio03;

class Retangulo extends figuraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcular_area() {
        return base * altura;
    }
}
