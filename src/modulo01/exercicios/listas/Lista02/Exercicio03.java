package modulo01.exercicios.listas.Lista02;

import java.util.Scanner;

//CALCULO DE MEDIA DE NOTAS//
public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sumNotas = 0;

        System.out.println("**CÁLCULO DE MÉDIA DE NOTAS**");
        System.out.print("Digite o número de notas para o cálculo da média:");
        float numNotas = scan.nextInt();
        for (int i = 0; i<numNotas; i++) {
            System.out.print("Digite a " +(i+1) +"º nota: ");
            sumNotas += scan.nextInt();
        }
        System.out.println("A média das notas é: " +(sumNotas/numNotas));
        scan.close();
    }
}
