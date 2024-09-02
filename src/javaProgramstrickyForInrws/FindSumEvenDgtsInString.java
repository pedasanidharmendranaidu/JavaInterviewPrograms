package javaProgramstrickyForInrws;

public class FindSumEvenDgtsInString {

    public static void main(String[] args) {
        String string="dha@3rma#!1ASD2042";
findSumDgts(string);
    }

    private static void findSumDgts(String string) {

        int sum=0;

        char[] charArray = string.toCharArray();
        for (int i = 0; i <charArray.length ; i++) {

            if (Character.isDigit(charArray[i])){
              //  int i1 = Integer.valueOf(String.valueOf(charArray[i]));
                String s = String.valueOf(charArray[i]);
        int i1   =     Integer.valueOf(s);
      //          int i1 = Integer.parseInt(s);
                if (i1%2==0)
                sum=sum+i1;
            }
        }
        System.out.println(sum);

    }


}
