package modulo03.Aula2.exemplo;

import java.time.LocalDate;

/*
INTERFACE
Só pode haver métodos abstratos (generalizando)
Só constantes (não pode propriedades)
 */
public interface Pessoa {

    public static final LocalDate dataNascimento = LocalDate.now();

    /*Todos os métodos de interface precisam ser implementados.
     Os métodos sempre são publico por padrão
     A única coisa que a interface tem é a assinatura do metodo:
     (tipo de retorno, o nome do metodo e os parametros recebidos)
     */
    public void calculaIdade(LocalDate dataNascimento);
}

/*
CLASSE Abstrata
pode ter métodos abstratos
pode ter propriedades

 */
abstract class Usuario implements Pessoa {
    private String login;
    private String senha;
    private String apelido;

    public void inventaApelido(){
        //codigo
    }
    /*
    Método abstrato não tem corpo -> '{código}'
     */
    public abstract void assoviar();

    /*
    Na classe usuário não foi implementado o metodo calculaIdade
    (solicitado na interface Pessoa que ela implementa), nem o metodo
    assoviar (metodo abstrato criado nela), a classe que estender
    de Usuário deverá implementar esses dois métodos.
     */
}

/*
A classe que não é abstrata pode tudo.

A Classe aluno quando criada deverá implementar calcula idade
e assoviar
 */

class Aluno extends Usuario{

    @Override
    public void calculaIdade(LocalDate dataNascimento) {

    }

    @Override
    public void assoviar() {

    }
}

