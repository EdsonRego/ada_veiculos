package com.edsonrego.veiculos;

public class Aviao extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("ligando Avião... ");
    }

    @Override
    public void desligar() {
        System.out.println("deligando Avião... ");
    }
}
