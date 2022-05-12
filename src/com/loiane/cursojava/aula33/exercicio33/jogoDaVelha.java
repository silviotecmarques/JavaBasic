package com.loiane.cursojava.aula33.exercicio33;

public class jogoDaVelha {

        private char [] [] jogoDaVelha;
        private int jogada;

        public jogoDaVelha(){
            jogoDaVelha = new char[3][3];
            jogada = 1;
        }

    public char[][] getJogoDaVelha() {
        return jogoDaVelha;
    }

    public void setJogoDaVelha(char[][] jogoDaVelha) {
        this.jogoDaVelha = jogoDaVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public  boolean validarJogada(int linha, int coluna, char sinal) {

            if (jogoDaVelha[linha][coluna]  == sinal || jogoDaVelha[linha] [coluna] == '0') {
                return false;
            } else {
                jogoDaVelha[linha] [coluna] = sinal;
                jogada++;
                return true;
            }
    }

    public void imprimirTabuleiro() {
            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0; j < jogoDaVelha[i].length; j++) {
                    System.out.println(jogoDaVelha[i] [j] + " | ");
                }
                System.out.println();
            }

    }
}
