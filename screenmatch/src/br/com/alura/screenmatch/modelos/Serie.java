package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporas() {
        return temporas;
    }

    public void setTemporas(int temporas) {
        this.temporas = temporas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
//        return super.getDuracaoEmMinutos();
        return temporas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "Serie: %s (%d)".formatted(this.getNome(), this.getAnoLancamento());

    }
}
