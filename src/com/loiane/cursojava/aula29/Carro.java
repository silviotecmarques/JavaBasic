package com.loiane.cursojava.aula29;
//Construtor
public class Carro {

    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Classe Carro foi instanciada.");
        numPassageiro = 4;
    }

    //Método com parâmetro
    double calcularCombustivel(double km) {

        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
