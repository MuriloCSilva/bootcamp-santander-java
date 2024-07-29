import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Olá, bem-vindo ao jogo da advinhação!\nPara começarmos, digite quantas chances voce deseja ter para acertar o número: ");
        int numeroDeChances = scanner.nextInt();
        int chancesUsadas = 0;

        int numeroAleatorio = random.nextInt(101) + 1;
        
        //APAGUE AQUI PARA MOSTRAR QUAL O NÚMERO ALEATÓRIO//System.out.println(numeroAleatorio);

        System.out.println("Muito bem! Você tem o total de: "+numeroDeChances+" chances para acertar o número aleatorio que está entre 0 a 100. Vamos começar!");

        while (chancesUsadas < numeroDeChances) {
            System.out.println("Digite um número: ");
            int numeroEscolhido = scanner.nextInt();

            if(numeroEscolhido == numeroAleatorio) {
                chancesUsadas = 99999999;
                System.out.println("Parabéns! Voce acertou o numero alatorio.");
            } else {
                ++chancesUsadas;
                if(numeroDeChances-chancesUsadas == 0) {
                    System.out.println("O seu número de chances acabou. Mais sorte na próxima!");
                } else {
                    System.out.println("Voce errou o número aleatorio e agora tem "+(numeroDeChances-chancesUsadas)+" chances. Tente novamente!\n");
                }
                
            };
        };
    }
}
