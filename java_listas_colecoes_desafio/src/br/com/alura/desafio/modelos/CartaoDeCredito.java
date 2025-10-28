package br.com.alura.desafio.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompra (Compra compra){
        if (this.saldo > compra.getPreco()){
            compras.add(compra);
            this.saldo -= compra.getPreco();
            return true;
        } else {
            return false;
        }

    }
}
