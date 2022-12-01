package modulo01.aulas;

import java.util.HashMap;
import java.util.Map;

//TWO SUM HASHMAP//
public class Aula04_Desafio_01b {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer target = 8;

        Integer[] nums = new Integer[]{1,7};
//            Integer[] nums = new Integer[]{7,1};
//            Integer[] nums = new Integer[]{3,1,7};
//            Integer[] nums = new Integer[]{3,7,1};
//            Integer[] nums = new Integer[]{3,5,7,1,0};

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if (map.containsValue(diff)) {
                System.out.printf(map.get(diff)+" " + i);
                break;
            }
            map.put(nums[i], i);
        }
    }
}