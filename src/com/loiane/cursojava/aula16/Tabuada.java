package com.loiane.cursojava.aula16;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        int max = 1;

        while (max <= 10){
            System.out.println("Soma: "+max+" = "+(num*max));
            max++;
        }

    }
}
