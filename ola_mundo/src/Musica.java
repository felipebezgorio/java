public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacaoes;

    void mostraFichaTecnica(){
        System.out.println("""
                Título: %s
                Artista: %s
                Ano de Lançamento: %d
                Média de Avaliações: %f
                """. formatted(titulo, artista, anoLancamento, mediaDeAvaliacoes()));
    }

    void avalia(double nota){
        avaliacao += nota;
        numAvaliacaoes++;
    }

    double mediaDeAvaliacoes(){
        if (avaliacao > 0 && numAvaliacaoes > 0) {
            return avaliacao / numAvaliacaoes;
        } else {
            return 0.0;
        }
    }
}
