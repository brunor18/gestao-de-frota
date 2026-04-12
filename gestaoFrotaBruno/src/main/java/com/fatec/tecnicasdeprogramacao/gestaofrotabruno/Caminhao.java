package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;

public abstract class Caminhao extends Veiculo {
    private String cor;
    private String modelo;
    private String marca;
    private String motor;
    private String tipo;
    
    private double nivelCombustivel;
    private int numeroDePortas;

    public Caminhao(String nome, double valorVenal) {
        super(nome, valorVenal);
        calcularIpva();
    }

    @Override
    public void calcularIpva() {
        setIpva(getValorVenal() * 0.015); // acessa via getter/setter
    }
}
