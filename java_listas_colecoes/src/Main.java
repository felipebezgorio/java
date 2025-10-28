import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(2);
        listaInteiros.add(6);
        listaInteiros.add(8);
        listaInteiros.add(9);
        listaInteiros.add(3);
        listaInteiros.add(1);
        listaInteiros.add(4);
        listaInteiros.add(0);
        listaInteiros.add(5);
        listaInteiros.add(7);

        Collections.sort(listaInteiros);
        System.out.println(".:: Números ordenados ::.");
        for (int i : listaInteiros){
            System.out.println(i);
        }


        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("The Office"));
        listaTitulos.add(new Titulo("Better Call Saul"));
        listaTitulos.add(new Titulo("Pequeno Sheldom"));
        listaTitulos.add(new Titulo("Rick and Morty"));

        Collections.sort(listaTitulos);
        System.out.println(".:: Títulos Ordenados ::.");
        listaTitulos.forEach(Titulo -> System.out.println(Titulo.getNome()));


        List<Titulo> listTitulos = new ArrayList<>();
        listTitulos.add(new Titulo("The Walking Dead"));
        listTitulos.add(new Titulo("The Simpsons"));
        listTitulos.add(new Titulo("The Big Bang Theory"));
        listTitulos.add(new Titulo("Sinfield"));

        Collections.sort(listTitulos);
        System.out.println(".:: Títulos Ordenados variavel LIST new ARRAYLIST ::.");
        listTitulos.forEach(Titulo -> System.out.println(Titulo.getNome()));


        List<Titulo> linklistTitulos = new LinkedList<>();
        linklistTitulos.add(new Titulo("The Witcher"));
        linklistTitulos.add(new Titulo("Breaking Bad"));
        linklistTitulos.add(new Titulo("Lupin"));
        linklistTitulos.add(new Titulo("Tulsa King"));

        Collections.sort(linklistTitulos);
        System.out.println(".:: Títulos Ordenados variavel LIST new LINKEDLIST ::.");
        linklistTitulos.forEach(Titulo -> System.out.println(Titulo.getNome()));

        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento1");
        listaPolimorfica.add("Elemento2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);






//        ArrayList<String> array = new ArrayList<>();
//        array.add("Felipe");
//        array.add("Mariani");
//        array.add("Barth");
//        array.add("Jimmy");
//        array.add("Charlie");
//
//        array.forEach(item -> System.out.println(item));
//        System.out.println("");
//        array.forEach(System.out::println);
//        System.out.println("");
//        for(String nome : array){
//            System.out.println(nome);
//        }
//
//        Cachorro cachorro = new Cachorro();
//        Animal animal = (Animal) cachorro;
//
//        Animal animal2 = new Cachorro();
//        if (animal2 instanceof Cachorro dog) {
//            System.out.println(dog);
//        }
//
//        Produto produto1 = new Produto("Teclado", 175.98, 10);
//        Produto produto2 = new Produto("Mouse", 95.92, 15);
//        Produto produto3 = new Produto("Monitor", 930.46,5);
//
//        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
//        listaDeProdutos.add(produto1);
//        listaDeProdutos.add(produto2);
//        listaDeProdutos.add(produto3);
//
//        double total = 0;
//        for (Produto prod : listaDeProdutos){
//            total += prod.getPreco();
//        }
//        System.out.println("Média de preço dos produtos é: %.2f".formatted(total/listaDeProdutos.size()));
//
//
//        ArrayList<Forma> listaDeFormas = new ArrayList<>();
//        listaDeFormas.add(new Circulo(10));
//        listaDeFormas.add(new Quadrado(2));
//
//        for(Forma forma : listaDeFormas){
//            forma.calculaArea();
//        }
//
//        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
//        listaDeContas.add(new ContaBancaria("1234-5", 1000));
//        listaDeContas.add(new ContaBancaria("6789-0", 1345.97));
//        listaDeContas.add(new ContaBancaria("1357-9", 453.90));
//
//        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
//        for (ContaBancaria conta : listaDeContas) {
//            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
//                contaMaiorSaldo = conta;
//            }
//        }
//
//        System.out.println("Conta com o maior saldo: %s, Saldo: %.2f".formatted(contaMaiorSaldo.getNumeroConta(), contaMaiorSaldo.getSaldo()));



//        Produto produto1 = new Produto("Teclado", 175.98, 10);
//        Produto produto2 = new Produto("Mouse", 95.92, 15);
//        Produto produto3 = new Produto("Monitor", 930.46,5);
//        ProdutoPerecivel perecivel = new ProdutoPerecivel("Banana", 4.99, 2, "01/11/2025");
//
//        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
//        listaDeProdutos.add(produto1);
//        listaDeProdutos.add(produto2);
//        listaDeProdutos.add(produto3);
//        listaDeProdutos.add(perecivel);
//
//        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
//        System.out.println("Produtos 2: " + listaDeProdutos.get(1).getNome());
//
//        System.out.println(listaDeProdutos.toString());
        
        
        
//        Pessoa pessoa1 = new Pessoa();
//        Pessoa pessoa2 = new Pessoa();
//        Pessoa pessoa3 = new Pessoa();
//
//        pessoa1.setNome("Felipe");
//        pessoa1.setIdade(34);
//
//        pessoa2.setNome("Mariani");
//        pessoa2.setIdade(36);
//
//        pessoa3.setNome("Fulano");
//        pessoa3.setIdade(15);
//
//        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
//        listaPessoas.add(pessoa1);
//        listaPessoas.add(pessoa2);
//        listaPessoas.add(pessoa3);
//
//        System.out.println(listaPessoas.size());
//        System.out.println("Primeira Pessoa: " + listaPessoas.get(0).getNome());
//        System.out.println(listaPessoas);
//
//        System.out.println("Com FOR");
//        for (Pessoa pessoa : listaPessoas){
//            System.out.println(pessoa);
//        }

    }
}