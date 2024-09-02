package javaProgramsEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDupInArry {


    public static void main(String[] args) {
        int[] inputArray=new int[]{111,222,222,333,444,444};

        findDupInArrHashMap(inputArray);

    }

    private static void findDupInArrHashMap(int[] inputArray) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int element:inputArray){


            if (map.get(element)==null){
                map.put(element,1);
            }else {
                map.put(element, map.get(element)+1);
            }

            Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();

            for (Map.Entry<Integer,Integer> entry : entrySet){
                if (entry.getValue()>1){
                    System.out.println("dup "+entry.getKey()+" : "+entry.getValue());
                }




            }

        }



    }
}
