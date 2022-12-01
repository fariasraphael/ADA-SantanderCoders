package modulo01.exercicios.listas.Lista03;

//ACHE UM NUMERO NO ARRAY//
public class ExercicioDeAula {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int numProcurado = 7;
        boolean bol = achaNum(arr, numProcurado);

        System.out.println(bol);

    }
    public static boolean achaNum (int[] a, int b){
        for (int num : a){
            if (num == b){
                return true;
            }
        }
        return false;
    }
}