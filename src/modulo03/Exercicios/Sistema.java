package modulo03.Exercicios;

public class Sistema {
    public static void main(String[] args) {
        Professor professor = new Professor("Kadu");

        Aluno aluno1 = new Aluno("Leonardo");
        Aluno aluno2 = new Aluno("Vivian");
        Aluno aluno3 = new Aluno("Raphael");

        Turma turma = new Turma();

        criarTurma(turma, professor, aluno1, aluno2, aluno3);

        System.out.println(turma);
    }
    public static void criarTurma (Turma turma, Professor professor, Aluno aluno1, Aluno aluno2, Aluno aluno3){
        turma.adicionarProfessor(professor);
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
    }
}