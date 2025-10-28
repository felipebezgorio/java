public class FormatacaoEConversao {
    public static void main(String[] args){
        double media = (8.9 + 9.5) / 2;
        System.out.println("Média das duas notas: " + media);

        int mediaInteira = (int) media;
        System.out.println("Conversão em inteiro: " + mediaInteira);

        String texto = "O char escolhido é:";
        char letra = 'A';
        System.out.println(texto + letra);

        double precoProduto = 11.95;
        int quantidade = 3;
        System.out.println("""
                Preço do Produto: %.2f
                Quantidade: %d
                Total: %.2f
                """.formatted(precoProduto, quantidade, (precoProduto*quantidade)));

        double valorEmDolares = 30.5;
        double cotacaoDolarReal = 4.94;
        System.out.println("%.2f de Dolares equivalem a %.2f Reais".formatted(valorEmDolares, (valorEmDolares*cotacaoDolarReal)));

        double precoOriginal = 25.47;
        double percentualDesconto = 10.0;
        double novoPreco = precoOriginal - (precoOriginal * (percentualDesconto/100));
        System.out.println("%.2f com %.2f%% de desconto fica %.2f".formatted(precoOriginal, percentualDesconto, novoPreco));

    }
}
