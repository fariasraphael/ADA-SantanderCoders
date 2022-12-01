package modulo01.exercicios.listas.Lista03;

import java.util.Scanner;

// CONSUMO DE COMBUSTÍVEL//
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("** CONSUMO DE COMBUSTÍVEL **");
        System.out.print("Digite a quantidade de horas de viagem: ");
        double tmp = scan.nextDouble();
        System.out.print("Digite a velocidade média do veiculo em KM/h: ");
        double vel = scan.nextDouble();

        consumo(tmp, vel);
    }
    public static void consumo (double tmp, double vel) {
        double cons = (vel * tmp)/12;
        System.out.printf("O consumo de combustível na viagem foi de %.03f litro(s)", cons);
    }
}
