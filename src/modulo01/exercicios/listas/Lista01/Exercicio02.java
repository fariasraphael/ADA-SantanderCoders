package modulo01.exercicios.listas.Lista01;

import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scan.nextLine();

            System.out.println("Digite seu salario:");
            double sal = scan.nextDouble();
            scan.nextLine();

            System.out.println("Digite seu idade:");
            int idade = scan.nextInt();
            scan.nextLine();

            System.out.println("Digite sua altura: ");
            double altura = scan.nextDouble();
            scan.nextLine();

            System.out.println("Digite seu sexo: ");
            String sexo = scan.nextLine();

            System.out.printf("nome: %s, salário: %f, idade: %d, altura: %f, sexo: %s", nome, sal, idade, altura, sexo);
        }
}
