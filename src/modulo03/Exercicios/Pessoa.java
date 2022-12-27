package modulo03.Exercicios;
abstract public class Pessoa implements Comparable<Pessoa>{
    public String nome;
    Pessoa(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.nome);
    }
}