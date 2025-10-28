package br.com.alura.desafio.modelos;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis(){
        System.out.println("Gato arranhando Móvies");
    }
}
