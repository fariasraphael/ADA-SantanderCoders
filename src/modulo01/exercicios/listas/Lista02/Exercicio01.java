package modulo01.exercicios.listas.Lista02;

import java.util.Scanner;
//WEIRED NOTWEIRED//
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um número: ");
        int num = scan.nextInt();

        if (num % 2!= 0 || num >= 6 && num <= 20){
            System.out.println("Weird");
            return;
        }
        System.out.println("Not Weird");
        scan.close();
    }
}
