package modulo03.Aula2;

import java.util.ArrayList;
import java.util.List;

public class Sala <T extends Participante>{
    private List<T> ts = new ArrayList<>();

    public boolean adicionaParticipante(T t){
        return ts.add(t);
    }
}
