package javaProgramsEx;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "java j2ee spring";
        String reverseString = "";
        String[] arrWords = s.split(" ");

        for (int i = 0; i < arrWords.length; i++) {
            String word = arrWords[i];
         String   reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);

            }
            reverseString = reverseString + reverseWord + " ";

        }

        System.out.println(reverseString);
    }
}
