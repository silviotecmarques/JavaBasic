package com.loiane.cursojava.aula27;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiro = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel30 = van.calcularCombustivel(30);
        double qtdCombustivel50 = van.calcularCombustivel(50);

        System.out.println("qtdCombustivel10: "+ qtdCombustivel10);
        System.out.println("qtdCombustivel30: "+ qtdCombustivel30);
        System.out.println("qtdCombustivel50: "+ qtdCombustivel50);

    }
}
