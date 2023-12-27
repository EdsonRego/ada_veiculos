package com.edsonrego.veiculos;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo onibus = new Onibus();
        Veiculo aviao = new Aviao();

        carro.ligar();
        carro.desligar();


    }
}
