package br.com.alura.desafio.modelos;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int primoAtual) {
        int numero = primoAtual + 1;
        while (!verificarPrimalidade(numero)){
            numero++;
        }
        return numero;
    }
}
