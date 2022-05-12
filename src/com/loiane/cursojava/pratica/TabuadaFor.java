package com.loiane.cursojava.pratica;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        for (int i = 1 ; i <=10; i++) {
            System.out.println("Soma: "+ num +"x"+ i +" = "+(i*num));

        }
    }
}

