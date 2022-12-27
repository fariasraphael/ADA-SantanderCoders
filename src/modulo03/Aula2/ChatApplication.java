package modulo03.Aula2;

public class ChatApplication {

    public static void main(String[] args){

        Sala<Aluno> salaAlunos = new Sala<>();
        Sala<Professor> salaProfessores = new Sala<>();

    }
    public <T extends Participante> void colocaTSala(Sala<T> sala, T t) {
        if(sala.adicionaParticipante(t)) {
            System.out.println("Participante adicionado.");
        } else {
            System.out.println("Erro ao adicionar participante.");
        }
    }


   /*
   public void colocaParticipanteSala (Sala sala, Participante participante){
        if(sala.adicionaParticipante(participante)) {
            System.out.println("Participante adicionado.");
        } else {
            System.out.println("Erro ao adicionar participante.");
        }
    }

    public void colocaAlunoSala(Sala sala, Aluno aluno) {
        //como Aluno estende Participante eu posso usar o metodo colocaParticipanteSala
        // dentro do metodo colocaAlunoSala passando o objeto sala e aluno, reduzindo codigo
        colocaParticipanteSala(sala, aluno);
    }

    public void colocaProfessorSala(Sala sala, Professor professor){
        //como Professor estende Participante eu posso usar o metodo colocaParticipanteSala
        // dentro do metodo colocaProfessorSala passando o objeto sala e professor, reduzindo codigo
        colocaParticipanteSala(sala, professor);
    }

    public void colocaAlunoSala(Sala sala, Aluno aluno) {
        //o método só aceita aluno devido este estender Participante
        if(sala.adicionaParticipante(aluno)) {
            System.out.println("Aluno adicionado.");
        } else {
            System.out.println("Erro ao adicionar Aluno.");
        }
    }

    public void colocaProfessorSala(Sala sala, Professor professor) {
        //o método só aceita professor devido este estender Participante
        if(sala.adicionaParticipante(professor)) {
            System.out.println("Professor adicionado.");
        } else {
            System.out.println("Erro ao adicionar Professor.");
        }
    }*/
}
