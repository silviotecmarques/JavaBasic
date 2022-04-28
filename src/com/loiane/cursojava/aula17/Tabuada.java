package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        for (int max = 1 ; max <=10; max++) {
            System.out.println("Soma: "+max+" = "+(max*num));

        }
    }
}

