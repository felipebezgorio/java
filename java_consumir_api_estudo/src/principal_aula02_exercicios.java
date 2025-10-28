import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;

public class principal_aula02_exercicios {
    public static void main(String[] args) {
        String json = """
                {
                "nome":"Felipe",
                "idade":34,
                "cidade":"Pato Branco",
                "estado":"Paraná"
                }
                """;

        //Exercicio 1
        Gson gson = new Gson();
        PessoaRecord pessoa = gson.fromJson(json, PessoaRecord.class);
        System.out.println(pessoa);

        //Exercicio 2
        Gson gson2 = new GsonBuilder().setStrictness(Strictness.LENIENT).create();
        PessoaRecord pessoa2 = gson.fromJson(json, PessoaRecord.class);
        System.out.println(pessoa2);

        //Exercicio 3
        record Editora (String nome, String cidade){};
        record Livro(String titulo, String autor, Editora editora){};

        String jsonLivro = """
                {
                    "titulo":"A Lenda de Ruff Ghanor",
                    "autor":"Leonel Caudela",
                    "editora":{
                        "nome":"Rocco",
                        "cidade":"São Paulo"
                    }
                }
                """;
        Gson gson3 = new Gson();
        Livro livro = gson3.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);


    }
}
