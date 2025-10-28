public class Circulo implements Forma{
    private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public void calculaArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do circulo é: " + area);
    }
}
