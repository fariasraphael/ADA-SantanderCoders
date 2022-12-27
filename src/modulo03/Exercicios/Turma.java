package modulo03.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Professor professor;
    private final List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno (Aluno aluno){
        alunos.add(aluno);
    }
    public void adicionarProfessor (Professor professor){
        this.professor = professor;
    }
    @Override
    public String toString() {
        return "Professor: " + professor.nome + " | Alunos: " + alunos;
    }
}
