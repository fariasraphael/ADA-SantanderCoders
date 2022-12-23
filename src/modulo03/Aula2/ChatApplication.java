package modulo03.Aula2;

public class ChatApplication {
    public static void main(String[] args) {

        Sala<Aluno> salaAlunos = new Sala<>();
        Sala<Professor> salaProfessores = new Sala<>();

        //salaAlunos.adicionaParticipante();

    }
    public void colocaParticipanteSala(Sala sala, Participante participante){
        if(sala.adicionaParticipante(participante)) {
            System.out.println("Participante adicionado.");
        } else {
            System.out.println("Erro ao adicionar participante.");
        }
    }

    public void colocaAlunoSala (Sala sala, Aluno aluno){
        colocaParticipanteSala(sala, aluno);

        /*if(sala.adicionaParticipante(aluno)) {
            System.out.println("Aluno adicionado.");
        } else {
            System.out.println("Erro ao adicionar aluno.");
        }*/
    }

    public void colocaProfessorSala (Sala sala, Professor professor){
        if(sala.adicionaParticipante(professor)) {
            System.out.println("Professor adicionado.");
        } else {
            System.out.println("Erro ao adicionar professor.");
        }
    }
    public <T extends Participante> void colocaTSala (Sala<T> sala, T t) {

        if(sala.adicionaParticipante(t)) {
            System.out.println("Professor adicionado.");
        } else {
            System.out.println("Erro ao adicionar professor.");
        }
    }
}
