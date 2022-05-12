package com.loiane.cursojava.aula29.pratica;

public class Carro {
    //Parametro
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double conCombustivel;

    //Construtor
    Carro(String marca, String modelo, int numPassageiros, double capCombustivel,double conCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.conCombustivel = conCombustivel;
    }
}
