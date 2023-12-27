package com.edsonrego.veiculos;

public class Onibus extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("ligando Onibus... ");
    }

    @Override
    public void desligar() {
        System.out.println("deligando Oninus... ");
    }
}
