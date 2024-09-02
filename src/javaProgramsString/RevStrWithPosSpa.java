package javaProgramsString;

public class RevStrWithPosSpa {

    public static void main(String[] args) {
        String string="p dharma naidu pedasani";
        char[] charArray = string.toCharArray();

        char[] resultArry=new char[charArray.length];

        for (int i = 0; i <charArray.length ; i++) {
            if (charArray[i]==' '){
                resultArry[i]=' ';
            }
        }
        int j=resultArry.length-1;
        for (int i = 0; i < charArray.length; i++) {

            if (resultArry[j]!=' '){
                j--;
            }
            resultArry[j]=charArray[i];
            j--;
         //   System.out.print( resultArry[j]);
        }
       /* for (int i = 0; i < resultArry.length ; i++) {
            System.out.print(" "+resultArry[i]);
        }
*/
    }


}
