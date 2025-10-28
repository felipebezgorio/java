import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class princial_arquivos {
    public static void main(String[] args) throws IOException {
        //Exercicio 1
        FileWriter arquivo = new FileWriter("arquivo.txt");
        arquivo.write("Conteúdo a ser gravado no arquivo.");
        arquivo.close();

        //Exercicio 2
        Titulo titulo = new Titulo("Matrix", 1998);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(titulo));
    }
}
