package javaProgramsEx;

import java.util.Scanner;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
      String s=  sc.nextLine();
     //   String s="dharma ndra naidu  pedasani";
        char[] charArr=s.toCharArray();
        String swithotspace="";
        int c=0;
        for (int i = 0; i <charArr.length ; i++) {

            if ((charArr[i]!=' ')  && (charArr[i]!='\t')     ){
                swithotspace=swithotspace+charArr[i];
            }
            if ((charArr[i]==' ') ){
                c++;
            }
        }
        System.out.println(swithotspace);
        System.out.println(c);
    }
}
