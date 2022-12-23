package modulo03.Exercicios;

public class Aluno extends Pessoa{
    Aluno (String nome) {
        super(nome);
    }

    @Override
    public compareTo(Aluno nome) {
        return this.nome.compareTo(nome.nome);
    }
}
