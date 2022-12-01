package modulo01.exercicios.listas.Lista04;

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        //String[] votos = {"huguinho", "huguinho", "huguinho", "luizinho", "luizinho", "huguinho", "zezinho", "luizinho", "zezinho", "luizinho"};

        Map<String, Integer> votacao = new HashMap<>();
        votacao.put("vi", 0);
        votacao.put("ze", 0);
        votacao.put("lu", 0);
        votacao.put("nulo", 0);
        eleicao(votacao);


    }

    public static void eleicao(Map<String, Integer> a) {
        // VOTAÇÃO
        String[] votos = new String[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Digite o nome do seu candidato:");
            System.out.println("vi");
            System.out.println("ze");
            System.out.println("lu");
            System.out.print("voto: ");
            votos[i] = scan.next();
        }

        for (int i = 0; i < votos.length; i++) {
            if (a.containsKey(votos[i])) {
                a.put(votos[i], a.get(votos[i]) + 1);
            } else {
                a.put("nulo", a.get("nulo") + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : a.entrySet()) {
            if (Collections.max(a.values()) == entry.getValue() && entry.getKey() != "nulo") {
                System.out.printf("O candidato(a) vencedor foi %s com %.2f%% dos votos.", entry.getKey(), (entry.getValue() * 100f/ votos.length));
            }
            else if (entry.getKey() == "nulo"){
                System.out.println("A maioria dos votos foi nulo");
            }
        }
    }
}