public class App {
    public static void main(String[] args) {
        String primeironome = "Murilo";
        String sobreNome = "Câmara";

        String nomeCompleto = nomeCompleto(primeironome, sobreNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
