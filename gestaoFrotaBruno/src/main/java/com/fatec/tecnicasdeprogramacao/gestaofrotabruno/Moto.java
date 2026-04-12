package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;


public abstract class Moto extends Veiculo {
    
    private String cor;
    private String modelo;
    private String marca;
    private String motor;
    private String tipo;
    
    private double nivelCombustivel;
    private int cilindradas;



    public Moto(String placa, double valorVenal) {
        super(placa, valorVenal);
        calcularIpva();
    }
    
    //SETTERS
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

    //GETTERS
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

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

    public int getCilindradas() {
        return cilindradas;
    }





    @Override
    public void manutencao() {
        System.out.println("Manutenção de moto: verificando corrente");
    }
    
    
}