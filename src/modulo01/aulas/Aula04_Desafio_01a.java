package modulo01.aulas;
//Two SUM//
public class Aula04_Desafio_01a {
    public static void main(String[] args) {
        int target = 9;
        int [] arr = {2, 11, 15 ,7};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j){
                    continue;
                }
                if (arr[i]+arr[j] == target){
                    System.out.println(i +" "+ j);
                    return;
                }
            }
        }
    }
}
