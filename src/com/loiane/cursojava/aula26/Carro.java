package com.loiane.cursojava.aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiro;
    double capCambustivel;
    double consumoCombustivel;

    double exibirAutonomia() {
        return capCambustivel * consumoCombustivel;
    }

}
