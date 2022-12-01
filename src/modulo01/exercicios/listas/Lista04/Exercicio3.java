package modulo01.exercicios.listas.Lista04;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4};
        int[] num2 ={1,1,1,1,1};

        acumulado(num2);
    }
    public static void acumulado(int[] a){
        int arrLen = a.length;
        System.out.print("[" +a[0]);
        for (int i = 1; i < arrLen; i++) {
            a[i] += a[i-1];
            System.out.print(", "+a[i]);
        }
        System.out.print("]");
    }
}
