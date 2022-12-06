package modulo02.POO;

import modulo02.POO.locadora.Filme;
import modulo02.POO.locadora.Locadora;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Filme marvel = new Filme("Pantera Negra", "Marvel", 7.00);
        Filme dc = new Filme("Mulher Maravilha", "Heróis", "dc", "10", 7.0);
        List<Filme> listaFilme = new ArrayList<>();
        listaFilme.add(marvel);
        listaFilme.add(dc);

        Locadora locadora = new Locadora("AdaFlix", "123456789", listaFilme);
        locadora.cadastrarFilme(marvel);
        locadora.cadastrarFilme(dc);
        locadora.listarFilmes();

//        Locadora locadora = new Locadora("AdaFlix", "123456789", listaFilme);
//        locadora.cadastrarFilme(marvel);
//        locadora.cadastrarFilme(dc);
//        locadora.listarFilmes();
    }
}
