package javaProgramsEx;

public class FindDupInString {
    public static void main(String[] args) {
        String s = "Dharmendraanaidu";

        String[] ss = s.split("");

        for (int i = 0; i < ss.length; i++) {
            int count = 0;
            for (int j = 0; j < ss.length; j++) {
                if (ss[i] == ss[j] && i > j) {
                    break;

                }
                if (ss[i] == ss[j]) {
                    count++;
                }

            }
            // System.out.println("    dfghjhgfdsrdfghj");
            if (count > 1) {
                System.out.println("duplicates:" + count + " occurance " + ss[i]);
            }
        }

    }
}
