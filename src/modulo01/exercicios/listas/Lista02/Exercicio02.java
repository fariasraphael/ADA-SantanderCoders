package modulo01.exercicios.listas.Lista02;

import java.util.Scanner;
//CALCULADORA SWITCH//
public class Exercicio02 {
    public static void main(String[] args) {

        int[] num;

        System.out.println("**CALCULADORA**");

        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Dividir (não é permitido divisão por ZERO)");
        System.out.println("4- Multiplicar");
        System.out.println("5- Resto");
        System.out.println("6- Radiciação");
        System.out.println("7- Potência");
        System.out.print("Escolha uma das opções acima: ");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Você escolheu operação de Somar");
                num = escolhaDoisNumeros();
                System.out.println("A soma dos números é: " +(num[0]+num[1]));
                break;

            case 2:
                System.out.println("Você escolheu operação de Subtrair");
                num = escolhaDoisNumeros();
                System.out.println("A subtração dos números é: " +(num[0]-num[1]));
                break;

            case 3:
                System.out.println("Você escolheu operação de Dividir");
                do {
                    num = escolhaDoisNumeros();
                    if (num[1] == 0) {
                        System.out.println("O segundo número não pode ser ZERO.");
                        System.out.println("Escolha novamente seus números.");
                    }
                }
                while (num[1] == 0);

                System.out.println("A divisão dos números é: " +(num[0]/num[1]));
                break;

            case 4:
                System.out.println("Você escolheu operação de Multiplicar");
                num = escolhaDoisNumeros();
                System.out.println("A multiplicação dos números é: " +(num[0]*num[1]));
                break;

            case 5:
                System.out.println("Você escolheu operação de Resto");
                num = escolhaDoisNumeros();
                System.out.println("O resto da divisão dos números é: " +(num[0]%num[1]));
                break;

            case 6:
                System.out.println("Você escolheu operação de Radiciação");
                num = escolhaDoisNumeros();
                System.out.println("A raiz " +num[1] +" de " +num[0] +" é: " + Math.pow(num[0], (1.0/(num[1]))));
                break;

            case 7:
                System.out.println("Você escolheu operação de Exponenciação");
                num = escolhaDoisNumeros();
                System.out.println("O valor de "+num[0] +" elevado a " +num[1] +" é: " +Math.pow(num[0], num[1]));
                break;

            default:
                System.out.println("operação não identificada");
        }
        scan.close();
    }
    public static int[] escolhaDoisNumeros() {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[2];
        System.out.println("Escolha 2 numeros:");
        for(int i=0; i <= nums.length-1; i++) {
            System.out.printf("%dº número: ", i+1);
            nums[i] = scan.nextInt();
        }
        scan.close();
        return nums;
    }
}
