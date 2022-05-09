package com.loiane.cursojava.treinir;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.matricular("Barbara", "João");

       System.out.println("Aluno: "+ aluno.getNome() + "\nResponsavel: " +aluno.getNomeResponsavel()+ "\nNum: "+ aluno.getMatricula());


    }
}
