package modulo03.Exercicios;

public class Sistema {
    public static void main(String[] args) {
        Professor professor = new Professor("Kadu");

        AlunoJava alunoJava1 = new AlunoJava("Leonardo Java");
        AlunoJava alunoJava2 = new AlunoJava("Vivian Java");
        AlunoJava alunoJava3 = new AlunoJava("Raphael Java");

        AlunoJS alunoJS1 = new AlunoJS("Leonardo JS");
        AlunoJS alunoJS2 = new AlunoJS("Vivian JS");
        AlunoJS alunoJS3 = new AlunoJS("Raphael JS");

        Turma <AlunoJava> turmaJava = new Turma<>();
        Turma <AlunoJS> turmaJS = new Turma<>();

        criarTurma(turmaJava, professor, alunoJava1, alunoJava2, alunoJava3);
        criarTurma(turmaJS, professor, alunoJS1, alunoJS2, alunoJS3);

        System.out.println(turmaJava);
        System.out.println(turmaJS);
    }
    public static <T extends Aluno> void criarTurma(Turma<T> turma, Professor professor, T t1, T t2, T t3){
        turma.adicionarProfessor(professor);
        turma.adicionarAluno(t1);
        turma.adicionarAluno(t2);
        turma.adicionarAluno(t3);
    }
}