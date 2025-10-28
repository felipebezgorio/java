package br.com.alura.estudos.modelos;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        System.out.println("%s é maior de idade? %b".formatted(nome, (idade > 18)));
    }
}
