package javaProgramsEx;

public class RevString {
    public static void main(String[] args) {
        String s="dharma",ss="";
        for (int i = 0; i < s.length(); i++) {
          ss=s.charAt(i)+ss;
        }
        System.out.println(ss);
    }
}
