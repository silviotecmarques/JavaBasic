package com.loiane.cursojava.aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {

        System.out.println("Autonomia do carro é: "+ capCombustivel * consumoCombustivel + " Km");
    }
}
