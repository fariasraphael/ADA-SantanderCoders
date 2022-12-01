package modulo01.exercicios.listas.Lista02;

import java.util.Scanner;

//FATORIAL//
public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("**FATORIAL**");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para saber seu fatorial: ");
        int numFatorial = scan.nextInt();
        int fatorial = numFatorial;
        if (numFatorial == 0) {
            fatorial = 1;
        } else {
            for (int i = numFatorial; i > 1; i--) {
                fatorial *= (i-1);
            }
        }
        System.out.println(+numFatorial +"! = " +fatorial);
        scan.close();
    }
}
