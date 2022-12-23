package modulo03.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Turma <T extends Aluno> {

    private List<T> ts = new ArrayList<>();
    private Professor professor;

    public void colocaAluno(T t) {
        ts.add(t);
    }

    public void colocaProfessor (Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return  " Nome do professor: " + professor + " | " +
                "Lista de alunos:" + ts + '}';
    }
}
