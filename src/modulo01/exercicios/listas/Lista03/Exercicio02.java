package modulo01.exercicios.listas.Lista03;

import java.util.Scanner;

//CONVERSOR DE TEMPERATURA//
public class Exercicio02 {
    public static void main(String[] args) {

        int temp = temp();
        int op = menu();
        conversor(op, temp);

    }
    public static int temp () {
        Scanner scan = new Scanner(System.in);
        System.out.println("**CONVERSOR DE TEMPERATURA**");
        System.out.println("Digite a temperatura atual:");
        return scan.nextInt();
    }
    public static int menu () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a conversão desejada");
        System.out.println("1 - celsius => kelvin");
        System.out.println("2 - kelvin => celsius");
        return scan.nextInt();
    }
    public static void conversor (int op, int temp){
        switch (op){
            case 1:
                double atual = temp + 273.15;
                System.out.println("Medida atual: " +temp +"ºC");
                System.out.println("Medida final: " +atual +"K");
                break;

            case 2:
                double atual2 = temp - 273.15;
                System.out.println("Medida atual: " +temp +"K");
                System.out.println("Medida final: " +atual2 +"ºC");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
