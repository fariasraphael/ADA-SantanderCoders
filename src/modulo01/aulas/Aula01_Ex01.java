package modulo01.aulas;

import java.util.Scanner;

public class Aula01_Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um seu nome: ");
        String nome = input.nextLine();
        System.out.printf("Hello, %s!", nome);
        input.close();
    }
}
