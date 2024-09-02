package javaProgramsArray;

public class RevNumber {
    public static void main(String[] args) {
        int number=12345,lastDgt=0,rev=0;

        while (number!=0){
          lastDgt=  number%10;
          rev=rev*10+lastDgt;
          number/=10;
        }
        System.out.println(rev);
    }
}
