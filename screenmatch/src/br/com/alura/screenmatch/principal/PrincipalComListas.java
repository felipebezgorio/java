package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Harry Potter e a Pedra Filosofal", 2001);
        Filme filme2 = new Filme("Avatar", 2014);
        Filme filme3 = new Filme("Cidade dos Anjos", 1995);

        filme1.avalia(9);
        filme2.avalia(9.5);
        filme3.avalia(8);

        Serie serie1 = new Serie("Breaking Bad", 2008);
        serie1.avalia(9.9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        System.out.println(".:: ForEach com expressao lambda ::.");
        lista.forEach(item -> System.out.println(item));

        System.out.println(".:: ForEach com Method Reference ::.");
        lista.forEach(System.out::println);

        System.out.println(".:: ForEach Padrão ::.");
        for(Titulo titulo: lista){
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() >=2){
                System.out.println(filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Teste");
        buscaPorArtista.add("Fulano");
        buscaPorArtista.add("Cicrano");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Lista ordenada:" + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenados:" + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
