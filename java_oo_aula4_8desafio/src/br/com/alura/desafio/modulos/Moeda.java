package br.com.alura.desafio.modulos;

public class Moeda implements ConversaoFinanceira{
    private double contacaoDolar;


    public double getContacaoDolar() {
        return contacaoDolar;
    }

    public void setContacaoDolar(double contacaoDolar) {
        this.contacaoDolar = contacaoDolar;
    }

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double convertido = valorDolar * contacaoDolar;
        System.out.println("O valor de US$ %.2f para real é R$ %.2f".formatted(valorDolar, convertido));
    }
}
