import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Olá, bem-vindo ao banco online DIO!");

        System.out.println("Por favor, insira o número de sua conta: ");
        contaTerminal.inserirNumeroDaConta(scanner.nextInt());

        System.out.println("Por favor, insira o número de sua agência: ");
        contaTerminal.inserirNumeroDaAgencia(scanner.next());

        System.out.println("Por favor, insira o seu nome: ");
        contaTerminal.inserirNomeDoCliente(scanner.next());

        System.out.println("Olá "+contaTerminal.nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+contaTerminal.agencia+", conta "+contaTerminal.numero+" e seu saldo "+contaTerminal.saldo+" já está disponível para saque.");

    }
}
