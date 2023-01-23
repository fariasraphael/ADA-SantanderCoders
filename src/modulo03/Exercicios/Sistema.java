package modulo03.Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        Professor professor = new Professor("Kadu");

        AlunoJava alunoJava1 = new AlunoJava("Leonardo Java", "000");
        AlunoJava alunoJava2 = new AlunoJava("Vivian Java","001");
        AlunoJava alunoJava3 = new AlunoJava("Raphael Java","002");

        List<AlunoJava> alunosJava = new ArrayList<AlunoJava>();
        alunosJava.add(alunoJava1);
        alunosJava.add(alunoJava2);
        alunosJava.add(alunoJava3);






        System.out.println(alunosJava);

/*        AlunoJS alunoJS1 = new AlunoJS("Raphael JS");
        AlunoJS alunoJS2 = new AlunoJS("Vivian JS");
        AlunoJS alunoJS3 = new AlunoJS("Leonardo JS");*/

/*        Turma <AlunoJava> turmaJava = new Turma<>();
        Turma <AlunoJS> turmaJS = new Turma<>();*/

/*        montarTurma(turmaJava, professor, alunoJava1, alunoJava2, alunoJava3);
        montarTurma(turmaJS, professor, alunoJS1, alunoJS2, alunoJS3);*/

    }
   /* public static <T extends Aluno> void montarTurma(Turma<T> turma, Professor professor, T t1, T t2, T t3){
        turma.adicionarProfessor(professor);
        turma.adicionarAluno(t1);
        turma.adicionarAluno(t2);
        turma.adicionarAluno(t3);
        Collections.sort(turma.ts);
    }*/
}