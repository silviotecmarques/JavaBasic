package com.loiane.cursojava.training;

import java.util.UUID;

public class Aluno extends Pessoa {
    
    private String nomeResponsavel;

    public String matricular(String nome,String nomeResponsavel) {
        super.setNome(nome);
        this.nomeResponsavel = nomeResponsavel;
        super.setMatricula(gerarNumMatricula());
        
        return getMatricula();
    }
    
    private String gerarNumMatricula(){

        String num = UUID.randomUUID().toString();
        
        return num;
    }
    
    
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
}
