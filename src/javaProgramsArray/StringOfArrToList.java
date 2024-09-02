package javaProgramsArray;

import java.util.Arrays;
import java.util.List;

public class StringOfArrToList {

    public static void main(String[] args) {

       String  arrStr[]={"dharma","max","Boom"};
        List<String> list = Arrays.asList(arrStr);
        System.out.println(list);

        String s="dharma";
        List<String> list1 = Arrays.asList(s);
        System.out.println(list1);
    }

}
