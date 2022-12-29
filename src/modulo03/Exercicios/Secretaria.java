package modulo03.Exercicios;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Secretaria {

    public <T extends Aluno> void matricular(Turma<T> turma, T t) {
        turma.ts.add(t);
        Collections.sort(turma.ts);
        //MÉTODO QUE INCLUI UM ALUNO EM UMA TURMA
    }

    public <T extends Aluno> void matricular(Turma<T> turma, Professor professor, List<T> listaAlunos){
        turma.adicionarProfessor(professor);
        turma.ts.addAll(listaAlunos);
        Collections.sort(turma.ts);
        //MÉTODO QUE MONTA UMA TURMA, INCLUI UM PROFESSOR E UMA LISTA DE ALUNOS EM UMA TURMA
    }

    public String getAlunoInfo (Aluno aluno){
        return aluno.nome;
    }
}
