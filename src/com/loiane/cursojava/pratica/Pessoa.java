package com.loiane.cursojava.pratica;

public class Pessoa {

    String nome = "Teddy";

    Pessoa() {
        String nome = "Ana";
        System.out.println(nome);
        System.out.println(this.nome);
        System.out.println(this.nome+" "+nome);
    }
}
