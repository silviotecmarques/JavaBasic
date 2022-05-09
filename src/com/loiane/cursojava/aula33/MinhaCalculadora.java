package com.loiane.cursojava.aula33;
//Sobrecarga de métodos e construtores
public class MinhaCalculadora {

    //método
    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int some(int[] vetorInteiros) {

        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }
}
