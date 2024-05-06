public class ForArrays {
    public static void main(String[] args) {
        String alunos [] = {
            "Felipe",
            "Julia",
            "Marcos",
            "Murilo"
        };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno "+i+" é o aluno "+alunos[i]);
        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
