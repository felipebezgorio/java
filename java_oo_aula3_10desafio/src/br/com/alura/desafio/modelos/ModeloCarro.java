package br.com.alura.desafio.modelos;

public class ModeloCarro extends Carro{

    public void exibeInformacoes(){
        System.out.println("""
                .:: Carro ::.
                Modelo: %s
                Preço Ano 1: %.2f
                Preço Ano 2: %.2f
                Preço Ano 3: %.2f
                Menor Preço: %.2f
                Maior Preço: %.2f
                """.formatted(getModelo(), getPrecoAno1(), getPrecoAno2(),
                              getPrecoAno3(), menorValor(), maiorValor()));
    }
}
