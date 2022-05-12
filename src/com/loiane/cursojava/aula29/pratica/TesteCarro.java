package com.loiane.cursojava.aula29.pratica;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("Fiat", "Duacato", 10, 100, 0.2);

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.numPassageiros);
        System.out.println(carro.capCombustivel);
        System.out.println(carro.conCombustivel);

    }
}
