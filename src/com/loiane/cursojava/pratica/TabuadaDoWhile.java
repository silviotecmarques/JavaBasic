package com.loiane.cursojava.pratica;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {

        int i = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        do {
            System.out.println("Soma: "+ num +"x"+ i +" = "+ (num*i));
            i++;
        }while (i <= 10);
    }
}
