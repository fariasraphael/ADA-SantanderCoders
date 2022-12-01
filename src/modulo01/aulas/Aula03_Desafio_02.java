package modulo01.aulas;

import java.util.Scanner;
//CALCULADORA//
public class Aula03_Desafio_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;
        int y;
        String opera;

        System.out.print("Primeiro número: ");
        x = scan.nextInt();

        System.out.print("Segundo número: ");
        y = scan.nextInt();
        scan.nextLine();

        System.out.print("Escolha uma operação:\n * soma\n * subtração\n * divisão\n * multiplicação\n");

        opera = scan.nextLine();

        switch (opera) {
            case "soma":
                System.out.println(x+y);
                break;

            case "subtração":
                System.out.println(x-y);
                break;

            case "multiplicação":
                System.out.println(x*y);
                break;

            case "divisão":
                System.out.println(x/y);
                break;

            default:
                System.out.println("operação inválida");
                break;
        }
        scan.close();
    }
}