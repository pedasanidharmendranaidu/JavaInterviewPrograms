package java8Programs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevEachWordString {

    public static void main(String[] args) {
        String s="pedasani Dharmendra naidu";

   String ss   =   Arrays.stream(s.split(" ")).map(word -> new StringBuffer(word).reverse())
        .collect(Collectors.joining(" "));


    }
}
