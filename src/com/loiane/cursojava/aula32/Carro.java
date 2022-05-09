package com.loiane.cursojava.aula32;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double conCombustivel;

    //Encapsulamento: métodos gettrs e setters
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel(){
        return this.capCombustivel;
    }

    public void setCapCombustivel( double capCombustivel){
        this.capCombustivel = capCombustivel;
    }

    public double getConCombustivel(){
        return this.conCombustivel;
    }

    public void setConCombustivel(double conCombustivel){
        this.conCombustivel = conCombustivel;
    }


}
