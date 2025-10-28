package br.com.alura.estudos.modelos;

public class ContaBancaria {
        private String numeroDaConta;
        private double saldo;
        public String titlar;

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroDaConta(String numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
