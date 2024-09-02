package javaProgramsEx;

import java.util.HashMap;
import java.util.Set;

public class DupCharInString {
    public static void main(String[] args) {
        dupCharInStringCount("dharmendranaidu");
        System.out.println("***********************");
        dupCharInStringCount("javajee");
        System.out.println("***********************");
        dupCharInStringCount("janaganaman");
    }

    private static void dupCharInStringCount(String inputString) {


        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] charArray = inputString.toCharArray();
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);

            }else {
                charCountMap.put(c, 1);
            }
        }
        Set<Character> charInString=charCountMap.keySet();

        for (Character ch: charInString){
            if (charCountMap.get(ch)>1){
                System.out.println(ch+" : "+charCountMap.get(ch));
            }
        }

    }
}
