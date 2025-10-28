package br.com.alura.desafio.principal;

import br.com.alura.desafio.modelos.CartaoDeCredito;
import br.com.alura.desafio.modelos.Compra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String descricaoCompra = "";
        double valorCompra = 0.0;

        System.out.println("Digite o limite do cartão:");
        CartaoDeCredito cartao = new CartaoDeCredito(leitor.nextDouble());

        while (true) {
            System.out.println("Digite a descrição a compra (digite F para finalizar):");
            descricaoCompra = leitor.next();

            if (descricaoCompra.toUpperCase().equals("F")) {
                break;
            }

            System.out.println("Digite o valor da compra:");
            valorCompra = leitor.nextDouble();

            if (cartao.lancaCompra(new Compra(descricaoCompra, valorCompra))) {
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }
        }

        Collections.sort(cartao.getCompras());
        System.out.println("");
        System.out.println(".:: Compras Realizadas ::.");
        System.out.println("--------------------------");
        cartao.getCompras().forEach(compra -> System.out.println(compra));
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Total Gasto: %.2f".formatted(cartao.getLimite() - cartao.getSaldo()));
        System.out.println("Saldo do Cartão: %.2f".formatted(cartao.getSaldo()));


    }
}