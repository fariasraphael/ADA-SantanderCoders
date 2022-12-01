package modulo01.exercicios.listas.Lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu idade: \n");
        int idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite sua profissão: ");
        String prof = scan.nextLine();

        System.out.printf("nome %s, idade %d, profissão %s", nome, idade, prof);

    }
}