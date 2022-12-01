package modulo01.exercicios.listas.Lista04;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 100, 1000};
        int[] arr2 = {5, 50, 500, 5000};

        mixArr(arr1, arr2);
    }
    public static void mixArr(int[] a, int[] b){
        int lenArr = a.length;
        System.out.print("[");
        for (int i = 0; i < lenArr; i++) {
            if(i == lenArr-1){
                System.out.print(a[i] +", " +b[i]);
            }
             else {
                System.out.print(a[i] + ", " + b[i] +", ");
            }
        }
        System.out.print("]");
    }
}