package modulo03.Exercicios;


import java.util.Collections;
import java.util.List;

public abstract class Secretaria {
    private final Turma<AlunoJava> java = new Turma<>();
    private final Turma<AlunoJS> js = new Turma<>();

    public <T extends Aluno> void matricular(Professor professor, T t) {
        //Turma<T>()
    }

    public <T extends Aluno> void matricular(Turma<T> turma, Professor professor, List<T> listaAlunos){
        //this.turma.adicionarProfessor(professor);
        turma.ts.addAll(listaAlunos);
        Collections.sort(turma.ts);
        //MÉTODO QUE INCLUI UM PROFESSOR E UMA LISTA DE ALUNOS EM UMA TURMA
    }

    public String getAlunoInfo (Aluno aluno){
        return aluno.nome;
    }
}
