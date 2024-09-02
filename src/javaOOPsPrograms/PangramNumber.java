package javaOOPsPrograms;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class PangramNumber {
    public static void main(String[] args) {


        BigInteger num= new BigInteger("223456074271889");
       boolean res=  findPangramNumOrNot(num);
        if (res) {
            System.out.println(" num is pangram");
        }else {
            System.out.println("num is not pangram");
        }


    }

    private static boolean findPangramNumOrNot(BigInteger num) {
        Set<Character> numSet=new HashSet<>();



             String s=  num.toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                numSet.add(s.charAt(i));
            }
        }
        if (numSet.size()==10){
            return true;
        }

        return false;
    }
}
