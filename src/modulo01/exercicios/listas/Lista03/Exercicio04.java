package modulo01.exercicios.listas.Lista03;

import java.util.Scanner;
//HORA TRABALHADA//
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**SALARIO ANUAL**");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Horas trabalhadas por mês: ");
        double hora = scan.nextDouble();
        System.out.print("Valor da hora trabalhada: ");
        double valorPorHora = scan.nextDouble();

        calcSalAnual(nome, hora, valorPorHora);
    }
    private static void calcSalAnual (String nome, double hora, double valPorHora){
        double SalAnual = hora * valPorHora * 12;
        System.out.printf("O salário anual do funcionário(a) %s é de %.02f", nome, SalAnual);

    }
}
