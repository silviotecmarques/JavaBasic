package com.loiane.cursojava.aula26;

import java.util.Scanner;

public class TesteCarro {



    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiro = 10;
        van.capCambustivel = 100;
        van.consumoCombustivel = 0.2;

        Carro fusca = new Carro();

        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiro = 4;
        fusca.capCambustivel = 30;
        fusca.consumoCombustivel = 0.15;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o número do carro: \n1.Van \n2.Fusca");
        int escolhacarro = scan.nextInt();

        switch (escolhacarro) {
            case 1: {
                double autonomia = van.exibirAutonomia();
                System.out.println("Autonomia do carro é: "+autonomia+" Km"); break;
                //Ou
                //System.out.println("Autonomia do carro é: "+ van.exibirAutonomia() +" Km");
            }
            case 2: {
                double autonomia = fusca.exibirAutonomia();
                System.out.println("Autonomia do carro é: "+autonomia+" Km"); break;
            }
            }

        }



}
