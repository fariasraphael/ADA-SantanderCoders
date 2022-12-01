package modulo01.aulas;

import java.util.Scanner;

public class Aula05_Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int a = scan.nextInt();
        menorMultPar(a);


    }
    public static void menorMultPar (int a){
        System.out.println("Menor multiplo par: " +a*2);

    }
}
