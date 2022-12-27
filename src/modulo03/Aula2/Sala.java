package modulo03.Aula2;

import java.util.ArrayList;
import java.util.List;

public class Sala <T extends Participante> {
    /*
    faço com que a lista e o metodo da Classe Sala aceite somente Tipos (T = TYPE) que estendam Participante
     */
    private List<T> ts = new ArrayList<>();

    public boolean adicionaParticipante(T t) {
        return ts.add(t);

    }
}
