package modulo02.POO.locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private String nomeLocadora;
    private String cnpj;
    private List<Filme> filmes = new ArrayList<>();

    public Locadora(String nomeLocadora, String cnpj, List<Filme> filmes) {
        this.nomeLocadora = nomeLocadora;
        this.cnpj = cnpj;
        this.filmes = filmes;
    }

    public Locadora(String nomeLocadora, String cnpj) {
        this.nomeLocadora = nomeLocadora;
        this.cnpj = cnpj;
        filmes = new ArrayList<>();
    }


    public Locadora() {}


    public String getNomeLocadora() {
        return nomeLocadora;
    }

    public void setNomeLocadora(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public void cadastrarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void listarFilmes(){
        for (Filme filme: this.filmes) {
            System.out.println(filme.toString());
        }
    }
    //Méodo que só lista o nome dos filmes
    public List<String> listarNomeFilme(){
        List<String> nomeFilmes = new ArrayList<>();
        for(Filme filme: this.filmes) {
            nomeFilmes.add(filme.getNome());
        }
        return nomeFilmes;
    }

}
