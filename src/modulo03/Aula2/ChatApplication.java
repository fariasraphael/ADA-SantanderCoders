package modulo03.Aula2;

public class ChatApplication {
    public void colocaParticipanteSala (Sala sala, Participante participante){
        if(sala.adicionaParticipante(participante)) {
            System.out.println("Participante adicionado.");
        } else {
            System.out.println("Erro ao adicionar participante.");
        }
    }

    public void colocaAlunoSala(Sala sala, Aluno aluno) {
        //o método só aceita aluno devido este estender Participante
        if(sala.adicionaParticipante(aluno)) {
            System.out.println("Aluno adicionado.");
        } else {
            System.out.println("Erro ao adicionar Aluno.");
        }
    }

}
