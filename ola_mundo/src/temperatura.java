public class temperatura {
    public static void main(String [] args){
        double temperaturaCelsius;
        double temperaturaFahrenheit;

        temperaturaCelsius = 30.4;
        temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("A temperatura %.2f Celsius é equivalente a %.2f em Fahrenheit".formatted(temperaturaCelsius, temperaturaFahrenheit));

        int tempFahrenheitSemCasas = (int) temperaturaFahrenheit;

        System.out.println("Temperatura Fahrenheit inteira é: " + tempFahrenheitSemCasas);
    }
}
