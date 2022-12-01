package modulo01.aulas;

import java.util.Scanner;
//ENTRADA DA BALADA//
public class Aula03_Desafio_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String queroEntrar, respostaEstaAcompanhado;

        do {
            System.out.println("Deseja entrar na festa? \n(responda \"s\" ou \"n\")");
            queroEntrar = scan.nextLine().toUpperCase();
        }
        while (queroEntrar.charAt(0) != 'S' && queroEntrar.charAt(0) != 'N');

        if (queroEntrar.charAt(0) == 'S'){
            System.out.println("Qual a sua idade?");
            int idade = scan.nextInt();
            scan.nextLine();

            if (idade >= 18) {
                System.out.println("Entrada permitida");

            } else {
                if (idade >= 16) {
                    do {
                        System.out.println("Você esta acompanhado de algum maior de idade? \n(responda \"s\" ou \"n\")");
                        respostaEstaAcompanhado = scan.nextLine().toUpperCase();
                    }
                    while (respostaEstaAcompanhado.charAt(0) != 'S' && respostaEstaAcompanhado.charAt(0) != 'N');

                    if (respostaEstaAcompanhado.charAt(0) == 'S') {
                        System.out.println("Entrada permitida");

                    } else {
                        System.out.println("Nesta festa somente entram pessoas maiores de idade ou a partir de 16 acompanhadas");
                    }
                } else {
                    System.out.println("Nesta festa somente entram pessoas maiores de idade ou a partir de 16 acompanhadas");
                }
            }
        } else {
            System.out.println("Tchau");
        }
        scan.close();
    }
}
