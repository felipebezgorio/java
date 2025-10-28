package br.com.alura.desafio.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        //Percentual de curtidas sobre reproducoes
        double perc = (getTotalCurtidas() *2.3 * 100) / getTotalReproducoes();
        perc /= 10;
        perc /= 2;
        return (int) perc;
    }
}
