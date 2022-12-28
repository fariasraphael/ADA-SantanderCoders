package modulo03.Aula2;

import java.util.ArrayList;
import java.util.List;

/*
<Classe sala se torna genérica quando informo que T extends uma Classe especifica.
Deste modo ela so aceita a Classe T e seus subtipos.
*/
public class Sala <T extends Participante> {
    /*
    faço com que a lista e o metodo da Classe Sala aceite somente Tipos (T = TYPE) que estendam Participante
     */
    private List<T> ts = new ArrayList<>();

    public boolean adicionaParticipante(T t) {
        return ts.add(t);
    }
    public void adicionarListaParticipantes (List<T> listT) {
        ts.addAll(listT);
    }
}

/*
classes genéricas não são tão comuns de serem criadas
normalmente cria-se métodos genéricos
normalmente cria-se interface para não ter a necessidade de criação de classes ou metodos genericos.
O generics foi criado para impedir erros do tipo ClassCastException, pois o java faz o casting dos valores passados.
O genérics aumenta a tipagem do JAVA.
não exite generics para primitvos, somente para objetos.
 */
