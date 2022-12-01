package modulo01.exercicios.listas.Lista02;

import java.util.Scanner;
 //TABUADA DE MULTIPLICAÇÃO//
public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("**TABUADA DE MULTIPLICAÇÃO**");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a tabuáda que desejada: ");
        int num = scan.nextInt();
        for (int i = 1; i<=10; i++) {
            System.out.println((+num +" X " +i +" = " +(num*i)));
        }
        scan.close();
    }
}