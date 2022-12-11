package modulo02.POO;

import modulo02.POO.locadora.Filme;
import modulo02.POO.locadora.Locadora;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Filme panteraNegra = new Filme("Pantera Negra", "Marvel", 7.00);
        Filme mulherMaravilha = new Filme("Mulher Maravilha", "Heróis", "dc", "10", 7.0);
        Filme harryPotter = new Filme ("Harry Potter e a Pedra Filosofal", 5.00);
        Filme cidadePerdida = new Filme("Cidade Perdida", 9.00);
        Filme morbius = new Filme("Morbius", 9.00);

        //exemplo de lista de filmes criadapara ser passada no construtor
        List<Filme> listaFilmes1 = new ArrayList<>();
        listaFilmes1.add(panteraNegra);
        listaFilmes1.add(mulherMaravilha);
        listaFilmes1.add(harryPotter);
        listaFilmes1.add(cidadePerdida);
        listaFilmes1.add(morbius);

//        criando uma locadora
        Locadora locadora = new Locadora("AdaFlix", "123456789", listaFilmes1);

//        locadora.listarFilmes();


        //exemplo de outra lista de filmes criada para ser passada no construtor usando set
        List<Filme> listaFilmes2 = new ArrayList<>();
        listaFilmes2.add(cidadePerdida);
        listaFilmes2.add(harryPotter);

        locadora.setFilmes(listaFilmes2);

//        locadora.listarFilmes();

        // exemplo de outra lista utilizandoo metododo de cadastrar
        locadora.cadastrarFilme(panteraNegra);
        locadora.cadastrarFilme(morbius);

        locadora.listarFilmes();
    }
}
