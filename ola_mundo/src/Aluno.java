public class Aluno {
    String nome;
    int idade;

    void exibirInformacoes(){
        System.out.println("Aluno: %s, %d anos de idade.".formatted(nome, idade));
    }
}
