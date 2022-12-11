package modulo02.POO.heranca.empresa;

public class Funcionario extends Pessoa{

    protected String matriculaFuncionario;

    public Funcionario(String nome, String cpf, String matriculaFuncionario) {
        super(nome, cpf);
        this.matriculaFuncionario = matriculaFuncionario;
    }
}
