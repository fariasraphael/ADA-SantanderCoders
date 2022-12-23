package modulo03.Exercicios;

abstract public class Pessoa implements Comparable<Pessoa>{
    String nome;

    Pessoa (String nome) {
    this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.getNome());
    }
}
