package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;


public abstract class Veiculo { 
    private String placa; 
    private double nivelCombustivel; 
    private double ipva;
    private double valor;
    
    
    public Veiculo(String placa) { 
        this.placa = placa; 
    } 
    // Encapsulamento 
    public String getPlaca() {
        return placa; 
    } 
    // Polimorfismo: método que será sobrescrito 
    public abstract void emitirRelatorio(); 

    public abstract void manutencao();

    }