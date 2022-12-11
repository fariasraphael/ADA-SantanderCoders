package modulo02.POO.heranca.empresa;

public class Empresa {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Raphael", "123456","987","JAVA-945");
        System.out.println(gerente.nome);

        Pessoa cliente = new Pessoa ("Vivian", "456789");
        System.out.println(cliente.nome);

    }
}
