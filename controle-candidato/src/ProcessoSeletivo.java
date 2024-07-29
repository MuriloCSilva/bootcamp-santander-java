import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String[] lista = selecaoCandidatos();
        imprimindoCandidatosSelecionados(lista);

    }

    static void imprimindoCandidatosSelecionados(String lista) {
        for (int i = 0; i < lista.length(); i++) {
            System.out.println(lista.charAt(i));
        }
    }

    static String[] selecaoCandidatos() {
        String [] candidatos = {
            "Felipe",
            "Murilo",
            "Julia",
            "Marcelo",
            "Monica",
            "Mirela",
            "Daniela"
        };

        int minCandidatosSelecionados = 5;
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        ArrayList<String> listaCadidatosSelecionados = new ArrayList<>();

        while (candidatosSelecionados < minCandidatosSelecionados) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" solicitou este valor de salário: "+salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            listaCadidatosSelecionados.add(candidatos[candidatosAtual]);
            candidatosAtual++;
            
        }

        String[] array = listaCadidatosSelecionados.toArray(new String[listaCadidatosSelecionados.size()]);

        return array;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com outro proposta");
        } else {
            System.out.println("Aguardadndo resultado dos demais candidatos");
        }
    }
}
