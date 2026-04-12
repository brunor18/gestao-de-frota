package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;


public abstract class Carro extends Veiculo {
    
    private String cor;
    private String modelo;
    private String marca;
    private String motor;
    private String tipo;
    
    private double nivelCombustivel;
    private int numeroDePortas;

    public Carro(String placa, double valorVenal) {
        super(placa, valorVenal);
        calcularIpva();
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
    
    public void setNumeroPortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }
    
    @Override
    public void manutencao() {
        System.out.println("Manutenção de carro: verificando óleo e pneus");
    }
    
    @Override
    public void calcularIpva() {
        setIpva(getValorVenal() * 0.04);
    }
}