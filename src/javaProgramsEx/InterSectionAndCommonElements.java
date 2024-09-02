package javaProgramsEx;

import java.util.HashSet;

public class InterSectionAndCommonElements {
    public static void main(String[] args) {

        String s1[]={"one","two","boom","three","four","six"};
        String s2[]={"boom","seven","one","two","three","four","nine","six"};


        HashSet<String> set=new HashSet<>();
        for (int i = 0; i < s1.length ; i++) {
            for (int j = 0; j < s2.length ; j++) {
                if (s1[i].equals(s2[j])){
                    set.add(s1[i]);
                }

            }

        }
        System.out.println(set);
    }
}
