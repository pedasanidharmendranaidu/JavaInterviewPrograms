package javaProgramsString;

public class PolindromePro {
    public static void main(String[] args) {
        String s="ammmaa",ss="";

        for (int i = 0; i < s.length(); i++) {
            ss=s.charAt(i)+ss;
        }
        System.out.println(ss.hashCode());
        System.out.println(s.hashCode());
        if (ss.equals(s)){
            System.out.println("polindrome");
        }else {
            System.out.println("not polindrome");
        }
    }
}
