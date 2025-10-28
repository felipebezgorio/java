public class Desafio09 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.saudacao();

        Calculadora calc = new Calculadora();
        System.out.println("O dobro de 35 é %d".formatted(calc.pegaODobro(35)));

        Musica musica1 = new Musica();
        musica1.titulo = "In the End";
        musica1.artista = "Linkin Park";
        musica1.anoLancamento = 2002;
        musica1.avalia(9.5);
        musica1.avalia(9.0);
        musica1.avalia(8.5);
        musica1.mostraFichaTecnica();

        Carro carro1 = new Carro();
        carro1.ano = 2010;
        carro1.cor = "Preto";
        carro1.modelo = "Gol";
        carro1.exibeFichaTecnica();

        Aluno aluno1 = new Aluno();
        aluno1.idade = 34;
        aluno1.nome = "Felipe";
        aluno1.exibirInformacoes();

    }
}
