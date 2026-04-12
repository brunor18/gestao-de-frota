package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;


public class Carro extends Veiculo implements Seguravel {
    
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

    public String getCor(){
        return cor;
    }



    
    @Override
    public void manutencao() {
        System.out.println("Manutenção de carro: verificando óleo e pneus");
    }
    
    @Override
    public void calcularIpva() {
        setIpva(getValorVenal() * 0.04);
    }

    @Override
    public void gerarApolice() {
        System.out.println("Apólice gerada para o carro modelo:" + getModelo() + " com placa: " + getPlaca());
        System.out.println("Valor segurado: R$ " + getValorVenal());
    }
}