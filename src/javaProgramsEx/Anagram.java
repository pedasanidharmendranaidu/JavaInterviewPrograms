package javaProgramsEx;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {


        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");


    }

    private static void isAnagram(String str1, String str2) {
        boolean status = true;
        if (str1.length() != str2.length()) {
            status=false;
        } else {
            char[] charArray = str1.toLowerCase().toCharArray();
            char[] charArray1 = str2.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            Arrays.sort(charArray1);
             status = Arrays.equals(charArray, charArray1);

        }


        if (status) {

            System.out.println(str1 + ":" + str2 + " are the anagrams");

        } else {
            System.out.println(str1 + ":" + str2 + " are not  the anagrams");
        }

    }

}
