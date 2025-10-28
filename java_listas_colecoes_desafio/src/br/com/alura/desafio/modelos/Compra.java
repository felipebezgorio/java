package br.com.alura.desafio.modelos;

public class Compra implements Comparable<Compra>{
    private String produto;
    private double preco;

    public Compra(String produto, double preco){
        this.produto = produto;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Compra: Produto: " + produto + " | Preço: " + preco;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        int comparacao = Double.compare(this.getPreco(), outraCompra.getPreco());
        //se for zero os valores são os mesmo, verifica pelo nome do produto
        if (comparacao == 0){
            return this.getProduto().compareTo(outraCompra.getProduto());
        } else {
            return comparacao;
        }


//        if (this.getPreco() > outraCompra.getPreco()) {
//            return 1;
//        } else if (this.getPreco() < outraCompra.getPreco()) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
