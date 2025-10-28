package br.com.alura.desafio.modulos;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("%d X %d = %d".formatted(numero, i, numero*i));
        }
    }
}
