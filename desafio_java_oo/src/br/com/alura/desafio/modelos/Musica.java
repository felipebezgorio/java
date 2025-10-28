package br.com.alura.desafio.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String algum) {
        this.album = algum;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        //Percentual de curtidas sobre reproducoes
        double perc = (getTotalCurtidas() * 2.5 * 100) / getTotalReproducoes();
        perc /= 10;
        perc /= 2;
        return (int) perc;
    }
}
