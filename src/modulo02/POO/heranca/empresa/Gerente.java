package modulo02.POO.heranca.empresa;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome,
                   String cpf,
                   String matriculaFuncionario,
                   String departamento) {
        super(nome, cpf, matriculaFuncionario);
        this.departamento = departamento;
    }
}
