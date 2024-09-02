package javaProgramsString;

public class RemoveSpace {
    public static void main(String[] args) {
        String s="pedasani  dharma   naidu p";
        String[] s1 = s.split(" ");

        String replace = s.replaceAll("\\s+", "");
        System.out.println(replace);
    }
}
