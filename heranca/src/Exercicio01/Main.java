package Exercicio01;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 2022, "Corolla");
        Aviao aviao = new Aviao("Boeing", 2018, "LATAM");

        System.out.println(carro.detalhes());
        System.out.println(aviao.detalhes());
    }
}
