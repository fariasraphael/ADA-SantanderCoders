package modulo03.Exercicios;
abstract public class Pessoa {
    public String nome;
    Pessoa(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }
}