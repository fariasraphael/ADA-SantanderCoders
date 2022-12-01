package modulo01.exercicios.listas.Lista03;

import java.util.Scanner;

//CALCULADORA 02 - FUNÇÕES//
public class Exercicio01 {
    public static void main(String[] args) {

        calculadora();

    }
    public static void calculadora() {
        int escolha;
        do {
            menu();
            escolha = op();
            opcao(escolha);
        } while (escolha != 8);
    }

    public static void menu (){
        System.out.println("**CALCULADORA**");
        System.out.println("1- ADIÇÃO");
        System.out.println("2- SUBTRAÇÃO");
        System.out.println("3- MULTIPLICAÇÃO");
        System.out.println("4- DIVISÃO");
        System.out.println("5- EXPONENCIÇÃO");
        System.out.println("6- RADICIAÇÃO");
        System.out.println("7- RESTO DA DIVISÃO");
        System.out.println("8- SAIR DA CALCULADORA");
        System.out.print("Escolha o número da operação desejada: ");
    }

    public static int op() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }


    public static void opcao(int op) {
        if (op == 8){
            System.out.println("Você escolheu sair da calculadora");
            return;
        }
        int[] nums = escolhaDoisNumeros();

        switch (op) {
            case 1:
                System.out.println("Você escolheu operação de Adição");
                System.out.println("A soma dos dois números é: " + (nums[0] + nums[1]));
                break;

            case 2:
                System.out.println("Você escolheu operação de Subtração");
                System.out.println("A subtração dos dois números é: " + (nums[0] - nums[1]));
                break;

            case 3:
                System.out.println("Você escolheu operação de Multiplicação");
                System.out.println("A multiplicação dos dois números é: " + (nums[0] * nums[1]));
                break;

            case 4:
                System.out.println("Você escolheu operação de Divisão");
                while (nums[1] == 0) {
                    System.out.println("O segundo número não pode ser ZERO.");
                    System.out.println("Escolha novamente seus números.");
                    nums = escolhaDoisNumeros();
                }
                System.out.println("A divisão dos dois números é: " + (nums[0] / nums[1]));
                break;

            case 5:
                System.out.println("Você escolheu operação de Exponenciação");
                System.out.println(nums[0] + " elevado a " + nums[1] + " é: " +Math.pow(nums[0], nums[1]));
                break;

            case 6:
                System.out.println("Você escolheu operação de Radiciação");
                System.out.println("A raiz " + nums[1] + " de " + nums[0] + " é: " +Math.pow(nums[0], (1.0 / (nums[1]))));
                break;

            case 7:
                System.out.println("Você escolheu operação de Resto da Divisão");
                System.out.println("O resto da divisão de " +nums[0] +" por " +nums[1] +" é: " + (nums[0] % nums[1]));
                break;

            default:
                System.out.println("operação não identificada");
                break;
        }
    }
    public static int[] escolhaDoisNumeros() {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[2];
        System.out.println("Escolha 2 numeros:");
        for(int i=0; i <= nums.length-1; i++) {
            System.out.printf("%dº número: ", i+1);
            nums[i] = scan.nextInt();
        }
        return nums;
    }
}
