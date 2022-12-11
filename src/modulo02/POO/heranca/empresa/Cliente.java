package modulo02.POO.heranca.empresa;

public class Cliente extends Pessoa{
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }
    public void tirarFerias(){
        System.out.println("Cliente não tira férias");
    };
}
