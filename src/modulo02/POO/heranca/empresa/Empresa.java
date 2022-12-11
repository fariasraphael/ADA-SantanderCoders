package modulo02.POO.heranca.empresa;

public class Empresa {
    public static void main(String[] args) {

        Cliente cliente = new Cliente ("Vivian", "456789");
        System.out.println(cliente.nome);

        Funcionario funcionario = new Funcionario(cliente.nome, cliente.cpf, "13579");
        System.out.println(funcionario.nome);
        funcionario.trabalhar();

        Gerente gerente = new Gerente("Raphael", "123456","987","JAVA-945");
        System.out.println(gerente.nome);
        gerente.contratarFuncionario();
        gerente.trabalhar();

        Estagiario estagiario = new Estagiario("Marcelle", "24680", "172839");
        estagiario.tirarFerias();



    }
}
