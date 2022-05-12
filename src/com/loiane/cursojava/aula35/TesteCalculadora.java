package com.loiane.cursojava.aula35;

public class TesteCalculadora {

    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        int fatorial = Calculadora.fatorial(5);

        System.out.println("Fatorial não recursivo: "+ fatorialNR + "\n" + "Fatorial recursivo: " +fatorial);
    }
}
