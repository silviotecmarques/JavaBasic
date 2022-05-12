package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class VariosIfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Preço do item:");
        double valor = scan.nextDouble();

        if (valor <= 10){
            System.out.println("Barato.");
        } else if (valor > 10 && valor < 15){
            System.out.println("Pedir desconto.");
        } else if ( valor >=15 && valor <17){
            System.out.println("Pesquisar mais.");
        } else {
            System.out.println("Muito caro!");
        }
    }
}
