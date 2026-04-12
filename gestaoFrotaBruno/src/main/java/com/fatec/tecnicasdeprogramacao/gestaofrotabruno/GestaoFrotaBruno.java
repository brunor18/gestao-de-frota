/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.tecnicasdeprogramacao.gestaofrotabruno;
import java.util.ArrayList;

/**
 *
 * @author fatec.aluno
 */
public class GestaoFrotaBruno {

    ArrayList<Veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void exibirIpvaDaFrota() {
        for (Veiculo veiculo : frota) {
            System.out.println("Placa do veículo " + veiculo.getPlaca());
            System.out.println("IPVA: R$ " + veiculo.getIpva());
            System.out.println("----------\n");
        }
    }
}
