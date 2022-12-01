package modulo01.exercicios.listas.Lista04;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] notas = {{9, 8, 7, 8}, {10, 9, 8, 9},{9, 8, 7, 8}};

        mediaNotas(notas);
    }

    public static void mediaNotas (int[][] a) {
        float mediaDaTurma = 0;
        int i=0;
        for (int alunos[] : a) {
            float mediaAluno = 0;
            for (int nota : alunos){
                mediaAluno += nota;
            }
            mediaAluno /= alunos.length;
            mediaDaTurma += mediaAluno;
            System.out.println("Aluno" +i++ +" - " +  "Média " +mediaAluno);
        }
        mediaDaTurma /= a.length;
        System.out.printf("Média da turma: %.2f", mediaDaTurma);
    }
}
