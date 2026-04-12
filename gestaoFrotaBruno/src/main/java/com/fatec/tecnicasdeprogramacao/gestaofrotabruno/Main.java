package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;

public class Main {
     public static void main(String[] args) {
        GestaoFrotaBruno gestao = new GestaoFrotaBruno();
        Carro meucarro = new Carro("HHX-2934", 807.00);


        meucarro.setCor("Amarelo");
        meucarro.setModelo("Murcialego");
        meucarro.setMarca("Lamborghini");
        meucarro.setMotor("V8 3.0L");
        meucarro.setNivelCombustivel(30);
        meucarro.setNumeroPortas(2);
        meucarro.setTipo("supercarro");

        System.out.println(meucarro.getCor());
        System.out.println(meucarro.getModelo());
        System.out.println(meucarro.getMarca());
        System.out.println(meucarro.getMotor());
        System.out.println(meucarro.getNivelCombustivel());
        System.out.println(meucarro.getNumeroDePortas());
        System.out.println(meucarro.getTipo());

        gestao.adicionarVeiculo(meucarro);

        gestao.exibirIpvaDaFrota();
    }
}
