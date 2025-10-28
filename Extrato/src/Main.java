import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        String nome = "Felipe Elfrance";
        String tipoConta = "Corrente";
        double saldo = 2500.0;
        int operacao = 0;
        double valor;

        System.out.println("""
        .:: Dados Iniciais do Cliente ::.
        Nome: %s
        Tipo conta: %s
        Saldo inicial: R$ %.2f
        """.formatted(nome, tipoConta, saldo));

        while (operacao != 4){
            System.out.println("""
                            Operações
            
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:""");

            operacao = leitor.nextInt();

            switch (operacao){
                case 1:
                    System.out.println("O saldo da conta é: %.2f".formatted(saldo));
                    break;
                case 2:
                    valor = 0;
                    System.out.println("""
                            .:: Receber Valor ::.
                            Informa o valor recebido:""");

                    valor = leitor.nextDouble();

                    if (valor <= 0) {
                        System.out.println("Valor informado inválido, não pode ser negativo.");
                    } else {
                        saldo += valor;
                        System.out.println("Valor recebido: %.2f".formatted(valor));
                    }

                    break;
                case 3:
                    valor = 0;
                    System.out.println("""
                            .:: Transferir Valor ::.
                            Informa o valor para transferir:""");

                    valor = leitor.nextDouble();

                    if (valor <= 0) {
                        System.out.println("Valor informado inválido, não pode ser negativo.");

                    } else if (valor > saldo){
                        System.out.println("Transferiencia não realizada. O valor %.2f é maior que o saldo disponível".formatted(valor));
                    } else {
                        saldo -= valor;
                        System.out.println("Valor transferido: %.2f".formatted(valor));
                    }

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Operação Inválida! Tente novamente.");
            }

        }

    }
}