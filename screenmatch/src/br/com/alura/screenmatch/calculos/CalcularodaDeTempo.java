package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalcularodaDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minuts de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
