package com.loiane.cursojava.aula34;

public class TesteMinhaCalculadora {

    static int resultado;
    //Modificador static
        public static void main(String[] args) {
            /*MinhaCalculadora calc = new MinhaCalculadora();

            calc.soma(1,2);
            calc.soma(1.0, 2.0);
            calc.soma(1,2,3);*/

            int calc = MinhaCalculadora.soma(1, 2);

           System.out.println("Soma: "+ calc);

        }
}
