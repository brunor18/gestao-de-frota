package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;

public abstract class Caminhao extends Veiculo {
    private String cor;
    private String modelo;
    private String marca;
    private String motor;
    private String tipo;
    private double pesoCarga; // em quilos
    
    private double nivelCombustivel;
    private int numeroDePortas;

    public Caminhao(String nome, double valorVenal) {
        super(nome, valorVenal);
        calcularIpva();
    }

    // SETTERS ///
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

    public void setPesoDaCarga(double pesoCarga){
        this.pesoCarga = pesoCarga;
    }


    // GETTERS //
    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    
    public String getModelo() {
        return modelo;
    }

    public double getPesoDaCarga(){
        return pesoCarga;
    }



    @Override
    public void calcularIpva() {
        setIpva(getValorVenal() * 0.015); // acessa via getter/setter
    }
}
