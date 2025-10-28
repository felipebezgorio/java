package br.com.alura.desafio.modelos;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero){
        if (super.verificarPrimalidade(numero)) {
            System.out.println("%d é número primo".formatted(numero));
        } else {
            System.out.println("%d não é número primo".formatted(numero));
        }
    }
}
