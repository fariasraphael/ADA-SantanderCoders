package modulo03.Aula2;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private List<Participante> participantes = new ArrayList<>();
            /*
            List<Participante> faz o java só aceitar Participante nessa lista, pois foi passado
             dentro do parametro '<Generico>'. Se esta estiver vazia, a lista aceitaria qualquer objeto.
             */
    public boolean adicionaParticipante(Participante participante) {
        return participantes.add(participante);

    }
}
