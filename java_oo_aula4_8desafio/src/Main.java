import br.com.alura.desafio.modulos.CalculadoraSalaRetangular;
import br.com.alura.desafio.modulos.Moeda;
import br.com.alura.desafio.modulos.TabuadaMultiplicacao;

public class Main {
    public static void main(String[] args) {
        System.out.println(".:: Conversão de Moeda ::.");
        Moeda moeda = new Moeda();
        moeda.setContacaoDolar(5.39);
        moeda.converterDolarParaReal(30.45);

        System.out.println(".:: Calculo de Área e Perímetro ::.");
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.calcularArea(3.45, 5.29);
        sala.calcularPerimetro(3.45, 5.29);

        System.out.println(".:: Tabuada ::.");
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);
    }
}