public class While {
    public static void main(String[] args) {
        int idade = 0;

        while (idade < 19) {
            if (idade >= 18) {
                System.out.println("Maior de idade!");
                break;
            }

            System.out.println("Sua idade: " + idade + ". Menor de idade!");
            idade++;
        }
    }
}
