package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;


public abstract class Moto extends Veiculo {
    
    private String cor;
    private String modelo;
    private String marca;
    private String motor;
    private String tipo;
    
    private double nivelCombustivel;
    private int cilindradas;

    public Moto(String placa) {
        super(placa);
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setMotor(String motor){
        this.motor = motor;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    
    public void setNivelCombustivel(double nivelCombustivel){
        this.nivelCombustivel = nivelCombustivel;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override
    public void manutencao() {
        System.out.println("Manutenção de moto: verificando corrente");
    }
    
}