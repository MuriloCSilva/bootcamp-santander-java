public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo = 104.32;

    public void inserirNumeroDaConta(int numeroDaConta) {
        numero = numeroDaConta;
    }

    public void inserirNumeroDaAgencia(String numeroDaAgencia) {
        agencia = numeroDaAgencia;
    }

    public void inserirNomeDoCliente(String nomeDoCliente) {
        nomeCliente = nomeDoCliente;
    }
}
