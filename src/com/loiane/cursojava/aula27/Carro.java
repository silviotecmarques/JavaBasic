package com.loiane.cursojava.aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;

    //Método com parâmetro
    double calcularCombustivel(double km) {

        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
