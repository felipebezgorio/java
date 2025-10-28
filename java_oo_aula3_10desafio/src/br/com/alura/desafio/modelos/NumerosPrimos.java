package br.com.alura.desafio.modelos;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0)
                    return false;
            }
            return true;
        }
    }

    public void listarPrimos(int primosAteoNumero){
        System.out.println("Números primos até " + primosAteoNumero);
        for (int i = 2; i <= primosAteoNumero; i++){
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

    }
}
