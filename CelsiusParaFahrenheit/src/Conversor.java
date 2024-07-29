import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de temperatura! Escolha uma das opções: ");
        System.out.println("\n[1] Celsius para Fahrenheit\n[2] Fahrenheit para Celsius\n[3] Cancelar");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a temperatura em Celsius: ");
                float temperaturaEmCelsius = scanner.nextFloat();
                
                System.out.println("A temperatura de " + temperaturaEmCelsius + "°C é igual a: " + CelsiusParaFahrenheit(temperaturaEmCelsius) + "°F.");
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit: ");
                float temperaturaEmFahrenheit = scanner.nextFloat();
                
                System.out.println("A temperatura de " + temperaturaEmFahrenheit + "°F é igual a: " + FahrenheitParaCelsius(temperaturaEmFahrenheit) + "°C.");
                break;
        
            default:
                break;
        }
    }

    public static String CelsiusParaFahrenheit(float Celsius) {
        float temperaturaFahrenheit = (Celsius * 9/5) + 32;
        String resultado = String.format("%.2f", temperaturaFahrenheit);
        return resultado;
    }

    public static String FahrenheitParaCelsius(float Fahrenheit) {
        float temperaturaCelsius = (Fahrenheit - 32) * 5/9;
        String resultado = String.format("%.2f", temperaturaCelsius);
        return resultado;
    }
}
