package com.edsonrego.veiculos;

public class SistemaSeguranca {
    public void desligarCarro(Carro carro) {
        carro.desligar();
    }

    public void desligarMoto(Moto moto) {
        moto.desligar();
    }

    public void desligarOnibus(Onibus onibus) {
        onibus.desligar();
    }

    public void desligarAviao(Aviao aviao) {
        aviao.desligar();
    }
}
