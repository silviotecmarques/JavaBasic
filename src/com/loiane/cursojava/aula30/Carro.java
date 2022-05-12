package com.loiane.cursojava.aula30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;
        //constutor
    public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiro = numPassageiro;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
}
