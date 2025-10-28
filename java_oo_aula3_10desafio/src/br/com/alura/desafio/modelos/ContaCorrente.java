package br.com.alura.desafio.modelos;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal cobrada (%.2f)".formatted(tarifaMensal));
    }
}
