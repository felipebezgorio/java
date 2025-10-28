import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        String busca = "";
        String url = "";

        while (true) {
            System.out.println("Informe um cep para pesquisar, ou pressione F para sair");
            busca = leitor.next();

            if (busca.equalsIgnoreCase("F")){
                break;
            }

            try {
                Endereco endereco = new ConsultaCEP().buscaEndereco(busca);
                System.out.println(endereco);
                GeradorDeArquivo geraArquivo = new GeradorDeArquivo();
                geraArquivo.salvaJson(endereco);

            } catch (RuntimeException e ){
                System.out.println(e.getMessage() );
                break;
            }

        }
        System.out.println("Programa finalizado.");
    }
}