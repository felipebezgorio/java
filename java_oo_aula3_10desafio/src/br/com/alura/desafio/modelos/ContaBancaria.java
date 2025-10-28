package br.com.alura.desafio.modelos;

public class ContaBancaria {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$ %.2f realizado com sucesso. Saldo atual: R$ %.2f".formatted(valor, saldo));
    }

    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ %.2f realizado com sucesso. Saldo atual: R$ %.2f".formatted(valor, saldo));
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo Atual: " + saldo);
    }

}
