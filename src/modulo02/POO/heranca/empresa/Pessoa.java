package modulo02.POO.heranca.empresa;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa (String nome,
                   String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public abstract void tirarFerias();
}
