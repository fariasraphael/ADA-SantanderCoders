package modulo01.aulas;

public class Aula03_Desafio_03 {
    public static void main(String[] args) {

        int[] arr1 = { 8, 7, 6};
        int[] arr2 = { 8, 7};

        boolean iguais = comparaArray(arr1, arr2);
        System.out.println(iguais);
    }
    public static boolean comparaArray (int[] arrA, int[] arrB){
        if (arrB.length != arrA.length) {
            return false;
        }

        for (int i = 0; i < arrA.length; i++) {
            if (arrB[i]!=arrA[i]){
                return false;
            }
        }
        return true;
    }
}
