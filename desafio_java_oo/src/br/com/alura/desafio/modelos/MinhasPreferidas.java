package br.com.alura.desafio.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 3){
            System.out.println(audio.getTitulo() + " é considerado sucesso e bem aceito por todos.");
        } else {
            System.out.println(audio.getTitulo() + " está no radar da galera");
        }
    }
}
