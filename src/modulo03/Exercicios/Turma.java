package modulo03.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Turma <T extends Aluno> {
    private Professor professor;
    public List<T> ts = new ArrayList<>();

    public void adicionarAluno (T t){
        ts.add(t);
    }
    public void adicionarProfessor (Professor professor){
        this.professor = professor;
    }
    @Override
    public String toString() {
        return "Turma de " + ts.get(0).getClass().getSimpleName() + " {Professor: " + professor.nome + " | Alunos: " + ts + "}";
    }
}