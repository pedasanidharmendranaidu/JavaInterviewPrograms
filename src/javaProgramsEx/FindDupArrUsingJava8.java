package javaProgramsEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDupArrUsingJava8{

    public static void main(String[] args) {
        int[] inputArray=new int[]{111,222,222,333,444,444};
String[] str={"max","max","ram","bheem","jagan","jagan"};
String strr="max max  max    ram bheem jagan jagan m m m";
        findDuplicatesUsingJava8(inputArray);
        findDuplicatesWordsUsingJava8(str);
        findDuplicatesWordsUsingJava8(strr);
    }

    private static void findDuplicatesWordsUsingJava8(String strr) {
        Set<String> dupSet=new HashSet<>();

        Set<String> list = Arrays.stream(strr.split("\\s+")).filter(i -> !dupSet.add(i)).collect(Collectors.toSet());
        System.out.println(list);
    }

    private static void findDuplicatesWordsUsingJava8(String[] str) {
        Set<String> dupSet=new HashSet<>();

        List<String> list = Arrays.stream(str).filter(i -> !dupSet.add(i)).toList();
        System.out.println(list);
    }

    private static void findDuplicatesUsingJava8(int[] inputArray) {

        Set<Integer> dupSet=new HashSet<>();

        List<Integer> list = Arrays.stream(inputArray).filter(i -> !dupSet.add(i)).boxed().toList();
        System.out.println(list);

    }


}
