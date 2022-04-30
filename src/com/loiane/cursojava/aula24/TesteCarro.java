package com.loiane.cursojava.aula24;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiro = 10;
        van.capCambustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiro);
        System.out.println(van.capCambustivel);
        System.out.println(van.consumoCombustivel);

        Carro fusca = new Carro();
        van.marca = "Volkswagen";
        van.modelo = "Fusca";
        van.numPassageiro = 4;
        van.capCambustivel = 30;
        van.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.numPassageiro);
        System.out.println(fusca.capCambustivel);
        System.out.println(fusca.consumoCombustivel);
    }
}
