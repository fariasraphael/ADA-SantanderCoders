package modulo03.Exercicios;

abstract public class Pessoa implements Comparable{
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
    public String toString() {
        return nome;
    }
}
