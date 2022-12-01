package modulo01.exercicios.listas.Lista04;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] nums = {0, 3, 4, 1, 0,3, 5, 0};

        System.out.println(pivo(nums));
    }

    public static int pivo(int[] a) {
        int sumEsq = 0;
        int sumDir = 0;
        for (int i = 0; i < a.length; i++) {
            sumDir += a[i];
            }

        for (int i = 0; i < a.length; i++) {
            sumDir -= a[i];

            if(sumDir == 0 && i == 0){
                return i;
            }
            if(sumEsq == sumDir){
                return i;
            }

            if (sumEsq == 0 && i == a.length-1) {
                return i;
            }
            sumEsq += a[i];
        }
        return -1;
    }
}

