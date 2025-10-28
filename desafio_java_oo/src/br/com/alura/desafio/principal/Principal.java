package br.com.alura.desafio.principal;

import br.com.alura.desafio.modelos.MinhasPreferidas;
import br.com.alura.desafio.modelos.Musica;
import br.com.alura.desafio.modelos.Podcast;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int loop = aleatorio.nextInt(1000);

        Podcast podcast = new Podcast();
        podcast.setTitulo("Dois Empregos");
        podcast.setDescricao("Podcast de humor contanto histórias de perregues no trabalho.");
        podcast.setHost("Claus e Kaio");

        //simular reproducoes e curtidas

        for (int i = 0; i <= loop; i++) {
            podcast.reproduzir();
            if ( i % 4 == 0) {
                podcast.curte();
            }
        }

        System.out.println("Classifição do PodCast: " + podcast.getClassificacao());

        Musica musica = new Musica();
        musica.setAlbum("Meteora");
        musica.setTitulo("Faint");
        musica.setArtista("Linkin Park");
        musica.setGenero("Rock Alternativo, Nu Metal, Rap Rock");

        //simular reproducoes e curtidas
        for (int i = 0; i <= loop; i++) {
            musica.reproduzir();
            if ( i % 3 ==0) {
                musica.curte();
            }
        }

        System.out.println("Classifição da Música: " + musica.getClassificacao());


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);




    }
}