import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {




//        System.out.println(".:: Buscar cotação cripto na API da Coingecko");
//        String apiKey = "INCLUIR A CHAVE DE API AQUI";
//        Scanner leitura = new Scanner(System.in);
//        System.out.println("Informe uma cripto para buscar");
//        System.out.println("bitcoin");
//        //tive que deixar fixo a moeda pq mudou a forma de busar em relaccao a epoca que foi feito o exercicio
//        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd,brl&ids=bitcoin&names=Bitcoin&symbols=btc?x_cg_demo_api_key=" + apiKey;
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
//        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());

//        System.out.println(".:: Buscar livro na API do Google Books ::.");
//        Scanner leitura = new Scanner(System.in);
//        String endereco;
//        String apiKey = "INCLUIR A CHAVE DE API AQUI";
//        System.out.println("Digite um o nome de um livro para ver mais informações:");
//        String busca = leitura.nextLine().replace(" ", "%20"); //substitui o espaço pelo %20
//
//        endereco = "https://www.googleapis.com/books/v1/volumes?q="+busca+"&key="+apiKey;
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
//        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());


    }
}