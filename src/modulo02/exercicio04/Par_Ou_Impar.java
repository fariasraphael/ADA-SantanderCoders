package modulo02.exercicio04;

/*
Questão #4
Valor 200
Enunciado
Construa um programa que receba um número como entrada e informe ao usuário se o número é impar ou par.
Para determinar se o número é impar ou par, você deve criar uma classe que represente este cálculo.
 */

public abstract class Par_Ou_Impar {

    public static String eParOuImpar(Integer number) {
        return (number % 2 != 0) ? "Impar" : "Par";
    }

}
