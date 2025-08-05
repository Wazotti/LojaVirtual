package Exercicio03;

public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(5.0, 3.0);
        Triangulo tri = new Triangulo(4.0, 6.0);

        System.out.println("Área do Retângulo: " + ret.calcular_area());
        System.out.println("Área do Triângulo: " + tri.calcular_area());
    }
}
