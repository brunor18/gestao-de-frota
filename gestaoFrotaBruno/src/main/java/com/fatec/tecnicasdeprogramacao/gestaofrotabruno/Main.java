package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;

public class Main {
     public static void main(String[] args) {
        GestaoFrotaBruno gestao = new GestaoFrotaBruno();

        Carro meucarro = new Carro("HHX-2934", 2000);

        Moto minhamoto = new Moto("CCC-2343",1000);

        Caminhao meucaminhao = new Caminhao("FFB-6767", 7000);


        meucarro.setCor("Amarelo");
        meucarro.setModelo("Murcialego");
        meucarro.setMarca("Lamborghini");
        meucarro.setMotor("V8 3.0L");
        meucarro.setNivelCombustivel(30);
        meucarro.setNumeroPortas(2);
        meucarro.setTipo("supercarro");

        minhamoto.setCor("Vermelho");
        minhamoto.setModelo("Roadster");
        minhamoto.setMarca("Harley Davidson");
        minhamoto.setMotor("Evolution V2");
        minhamoto.setNivelCombustivel(50);
        minhamoto.setTipo("Moto esportiva");
        minhamoto.setCilindradas(1200);

        meucaminhao.setCor("Branco");
        meucaminhao.setModelo("FMX");
        meucaminhao.setMarca("Volvo");
        meucaminhao.setMotor("V6 4.0L");
        meucaminhao.setNivelCombustivel(100);
        meucaminhao.setNumeroPortas(2);
        meucaminhao.setTipo("Caminhão Flat");
        meucaminhao.setPesoDaCarga(200);



        System.out.println("---------EXEMPLO DE CARRO-----------");
        System.out.println(meucarro.getCor());
        System.out.println(meucarro.getModelo());
        System.out.println(meucarro.getMarca());
        System.out.println(meucarro.getMotor());
        System.out.println(meucarro.getNivelCombustivel());
        System.out.println(meucarro.getNumeroDePortas());
        System.out.println(meucarro.getTipo());

        System.out.println("---------EXEMPLO DE MOTO-----------");
        System.out.println(minhamoto.getCor());
        System.out.println(minhamoto.getModelo());
        System.out.println(minhamoto.getMarca());
        System.out.println(minhamoto.getMotor());
        System.out.println(minhamoto.getNivelCombustivel());
        System.out.println(minhamoto.getTipo());

        System.out.println("---------EXEMPLO DE CAMINHAO-----------");
        System.out.println(meucaminhao.getCor());
        System.out.println(meucaminhao.getModelo());
        System.out.println(meucaminhao.getMarca());
        System.out.println(meucaminhao.getMotor());
        System.out.println(meucaminhao.getNivelCombustivel());
        System.out.println(meucaminhao.getNumeroDePortas());
        System.out.println(meucaminhao.getTipo());
        System.out.println(meucaminhao.getPesoDaCarga());

        gestao.adicionarVeiculo(meucarro);
        gestao.adicionarVeiculo(minhamoto);
        gestao.adicionarVeiculo(meucaminhao);


        System.out.println("---------MANUTENCOES-----------");

        meucarro.manutencao();
        minhamoto.manutencao();
        meucaminhao.manutencao();

        System.out.println("---------APOLICE DO CARRO-----------");
        meucarro.gerarApolice();
        System.out.println("\n");
        gestao.exibirIpvaDaFrota();
    }
}
