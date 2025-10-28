package br.com.alura.desafio.modulos;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área de um retangulo de %.2f X %.2f é %.2f".formatted(altura, largura, area));
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro de um retangulo de %.2f X %.2f é %.2f".formatted(altura, largura, perimetro));
    }
}
