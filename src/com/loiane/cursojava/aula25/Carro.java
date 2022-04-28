package com.loiane.cursojava.aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiro;
    double capCambustivel;
    double consumoCombustivel;

    void exibirAutonomia() {

        System.out.println("Autonomia do carro é: "+ capCambustivel * consumoCombustivel + " Km");
    }
}
