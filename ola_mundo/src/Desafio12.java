import br.com.alura.estudos.modelos.*;
import br.com.alura.estudos.modelos.Aluno;

public class Desafio12 {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroDaConta("12345-6");
        conta.setSaldo(2500.0);
        conta.titlar = "Felipe";

        System.out.println("""
                Conta: %s
                Titular: %s
                Saldo: %.2f
                """.formatted(conta.getNumeroDaConta(), conta.titlar, conta.getSaldo()));


        IdadePessoa idade = new IdadePessoa();
        idade.setNome("Felipe");
        idade.setIdade(34);
        idade.verificarIdade();

        Produto produto1 = new Produto();
        produto1.setNome("Garrafa");
        produto1.setPreco(2.5);
        System.out.println("Produto: %s | Preço: %f".formatted(produto1.getNome(), produto1.getPreco()));

        produto1.aplicarDesconto(15.0);
        System.out.println("Produto: %s | Preço: %f".formatted(produto1.getNome(), produto1.getPreco()));

        Aluno aluno1 = new Aluno();
        aluno1.setAluno("Mariani");
        aluno1.setNota1(9.5);
        aluno1.setNota2(10);
        aluno1.setNota3(9.9);
        System.out.println("Aluno(a): %s | Média: %.2f".formatted(aluno1.getAluno(), aluno1.calcularMedia()));


    }
}
