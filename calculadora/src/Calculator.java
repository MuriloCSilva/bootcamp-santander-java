import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Escreva outro número: ");
        double numero2 = scanner.nextDouble();

        char operator = scanner.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = numero1 + numero2;
                break;
            case '-':
                result = numero1 - numero2;
                break;
            case '*':
                result = numero1 * numero2;
                break;
            case '/':
                result = numero1 / numero2;
                break;            
            default:
            System.out.println("Operação inválida!");
                return;
        }

        System.out.println(numero1+" "+operator+" "+numero2+"= "+result);
        
    }
}
