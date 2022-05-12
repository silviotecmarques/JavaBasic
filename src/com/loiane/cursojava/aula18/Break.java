package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class Break {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        System.out.println("Digite um limite:");
        int max = scan.nextInt();

        for (int i = num; i < max; i++){
            System.out.println(i%7);
            System.out.println(i/7);
            //105 dividido por 7 é igual a 15 e sobrou 0
            //106 dividido por 7 é igual a 15 e sobrou 1
            if (i % 7 == 0){
                System.out.println("Valor de i: "+ i);
                break;
            }
        }



    }
}
