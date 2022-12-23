package modulo03.Exercicios;

public class Sistema {

    public static void main(String[] args) {

        Turma<AlunoJava> turmaJava = new Turma<>();
        Turma<AlunoJavaScript> turmaJavaSript = new Turma<>();

        Professor professor = new Professor("kadu");

        AlunoJava alunoJava1 = new AlunoJava("raphael Java");
        AlunoJava alunoJava2 = new AlunoJava("vivian Java");
        AlunoJava alunoJava3 = new AlunoJava("leonardo Java");



        AlunoJavaScript alunoJavaScript1 = new AlunoJavaScript("raphael JS");
        AlunoJavaScript alunoJavaScript2 = new AlunoJavaScript("vivian JS");
        AlunoJavaScript alunoJavaScript3 = new AlunoJavaScript("leonardo JS");


        colocaProfessorTurma(turmaJavaSript, professor);
        colocaAlunoTurma(turmaJavaSript, alunoJavaScript1);
        colocaAlunoTurma(turmaJavaSript, alunoJavaScript2);
        colocaAlunoTurma(turmaJavaSript, alunoJavaScript3);

        colocaProfessorTurma(turmaJava, professor);
        colocaAlunoTurma(turmaJava, alunoJava1);
        colocaAlunoTurma(turmaJava, alunoJava2);
        colocaAlunoTurma(turmaJava, alunoJava3);

        System.out.println(turmaJava);
        System.out.println(turmaJavaSript);

    }
    public static <T extends Aluno> void colocaAlunoTurma(Turma<T> turma, T ts) {
        turma.colocaAluno(ts);
    }

    public static void colocaProfessorTurma(Turma turma, Professor professor){
        turma.colocaProfessor(professor);
    }
}
