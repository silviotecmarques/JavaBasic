package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade:");

        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade.");
        }

       System.out.println("Menor de idade.");
    }
}
