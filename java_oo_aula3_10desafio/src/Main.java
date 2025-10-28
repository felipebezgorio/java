import br.com.alura.desafio.modelos.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.setModelo("Gol");
        carro.definirPrecos(1000.0, 1500.0, 1250.0);
        carro.exibeInformacoes();


        System.out.println(".:: Animal ::.");
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();


        System.out.println(".:: Conta Corrente ::.");
        ContaCorrente conta = new ContaCorrente();
        conta.setTarifaMensal(1.67);
        conta.depositar(1000.0);
        conta.sacar(25.9);
        conta.sacar(125.98);
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();

        System.out.println(".:: Números Primos ::.");
        int numero = 53;
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        GeradorPrimo geradorPrimo = new GeradorPrimo();

        numerosPrimos.listarPrimos(numero);
        verificadorPrimo.verificarSeEhPrimo(numero);
        System.out.println("Próximo número primo depois do %d é %d".formatted(numero, geradorPrimo.gerarProximoPrimo(numero)));
        
    }
}