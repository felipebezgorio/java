import br.com.alura.aula.excecao.ErroConsultaGitHub;
import br.com.alura.aula.excecao.SenhaInvalidaException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal_aula02_tratavida_excecao {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        //Exercicio 1
        System.out.println("Informe um numero:");
        int primeiroNumero = leitor.nextInt();
        System.out.println("Informe o segundo numero:");
        int segundoNumero = leitor.nextInt();

        try {
            System.out.println(primeiroNumero / segundoNumero);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro ao dividir os numeros: " + e.getMessage());
        }

        //Exercicio 2
        System.out.println("Informe uma senha:");
        String senha = leitor.next();

        try {
            validaSenha(senha);
        } catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }

        //Exercicio 3
        System.out.println("Informe o usuário do GitHub");
        String usuario = leitor.next();
        String endereco = "https://api.github.com/users/" + usuario;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404){
                throw new ErroConsultaGitHub("Usuário do github não encontrado");
            } else {
                System.out.println(response.body());
            }

        } catch (ErroConsultaGitHub e){
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    public static void validaSenha(String senha){
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha de ter pelo menos oito caracteres!");
        }
    }
}
