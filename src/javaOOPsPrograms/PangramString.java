package javaOOPsPrograms;

import java.util.HashSet;
import java.util.Set;

public class PangramString {

    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog";

        boolean result = findPangramOrNot(string);
        if (result) {
            System.out.println(": it is apangram ");
        } else {
            System.out.println(": not a pangram");
        }
    }

    private static boolean findPangramOrNot(String string) {

        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {

            char ch = string.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                charSet.add(ch);
            } else if (ch >= 'A' && ch <= 'Z') {

                charSet.add(Character.toLowerCase(ch));

            }
        }
if (charSet.size()==26){
    return true;
}else {
    return false;
}

      //  return charSet.size()==26;
    }
}
