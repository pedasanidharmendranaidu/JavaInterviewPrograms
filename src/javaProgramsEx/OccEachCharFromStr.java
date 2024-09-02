package javaProgramsEx;

import java.util.HashMap;

public class OccEachCharFromStr {
    public static void main(String[] args) {
        String str="dharmendra naidu P";

        FindOccEachChar(str);

    }

    private static void FindOccEachChar(String str) {

        HashMap<Character,Integer> map=new HashMap<>();

        char[] charArray = str.toLowerCase().toCharArray();

        for (char c: charArray){
            if (map.containsKey(c)){
              map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(" the input:"+str+" : "+map);
    }
}
