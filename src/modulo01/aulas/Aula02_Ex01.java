package modulo01.aulas;

import java.util.Scanner;

public class Aula02_Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = input.nextInt();


        System.out.printf(" A soma dos números é: %d \n", a+b);
        System.out.printf(" A subtração dos números é: %d \n", a-b);
        System.out.printf(" A multiplicação dos números é: %d \n", a*b);
        System.out.printf(" A divisão dos números é: %d \n", a/b );

        input.close();
    }
}
