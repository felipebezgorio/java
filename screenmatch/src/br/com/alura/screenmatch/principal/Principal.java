package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalcularodaDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter e a Pedra Filosofal", 2001);
        meuFilme.setDuracaoEmMinutos(152);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        meuFilme.avalia(8.9);

        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de Avaliações: " + meuFilme.pegaMedia());

        Serie serie1 = new Serie("Breaking Bad", 2008);
        serie1.setTemporas(6);
        serie1.setEpisodiosPorTemporada(15);
        serie1.setMinutosPorEpisodio(60);
        serie1.exibeFichaTecnica();
        System.out.println("Duração para maratonar: " + serie1.getDuracaoEmMinutos());

        CalcularodaDeTempo calculadora = new CalcularodaDeTempo();
        calculadora.inclui( meuFilme);
        System.out.println(calculadora.getTempoTotal());

        Filme outroFilme = new Filme("Avatar", 2014);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(true);
        System.out.println(calculadora.getTempoTotal());

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalDeVisualizacoes(5000);
        filtro.filtra(episodio);

        Filme filmeMariani = new Filme("Cidade dos Anjos", 1995);
        filmeMariani.setDuracaoEmMinutos(180);
        filmeMariani.avalia(9.5);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeMariani);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da Lista " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());

        System.out.println("Lista com toString: " + listaDeFilmes.toString());



    }
}