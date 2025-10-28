public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("""
                Modelo: %s
                Cor: %s
                Ano: %d
                Idade: %d
                """.formatted(modelo, cor, ano, pegaIdade()));
    }

    int pegaIdade(){
        return 2025 - ano;
    }
}
