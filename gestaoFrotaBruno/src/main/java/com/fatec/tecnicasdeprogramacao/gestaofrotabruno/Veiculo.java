package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;


public abstract class Veiculo { 
    private String placa; 
    private double nivelCombustivel; 
    private double ipva;
    private double valorVenal;
    
    
    public Veiculo(String placa, double valorVenal) { 
        this.placa = placa; 
        this.valorVenal = valorVenal;
    } 


    public abstract void manutencao();
    public abstract void calcularIpva();


    // Encapsulamento 
    public String getPlaca() {
        return placa; 
    } 

    public Double getValorVenal(){
        return valorVenal;
    }

    public Double getIpva(){
        return ipva;
    }

    protected void setIpva(double ipva){
        this.ipva = ipva;
    }
}