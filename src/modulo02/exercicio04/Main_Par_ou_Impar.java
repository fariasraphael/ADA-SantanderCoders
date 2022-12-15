package modulo02.exercicio04;

import java.util.Scanner;

public class Main_Par_ou_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        Integer number = scan.nextInt();
        scan.nextLine();

        //String parOuImpar = Par_Ou_Impar.eParOuImpar(number);
        System.out.println(number + " é " + Par_Ou_Impar.eParOuImpar(number));

    }
}
