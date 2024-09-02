package javaProgramsEx;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccEachElementFromArr {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,9,6,7,4,7,4,2,2,9,2,44,44,4,3,4,2,9,9,7,0,7,};

        findOccElementFromArr(arr);
    }

    private static void findOccElementFromArr(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for ( int i: arr){

            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);

            }else {
                map.put(i,1);
            }

        }

        System.out.println(map);
        System.out.println("**************************************************************");

        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        for (Map.Entry<Integer,Integer> entry: entrySet){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }




    }
}
