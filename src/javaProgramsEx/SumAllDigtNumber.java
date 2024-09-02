package javaProgramsEx;

public class SumAllDigtNumber {
    public static void main(String[] args) {
        int num=1234;
        FindSumDigits(num);

    }

    private static void FindSumDigits(int num) {

        int n=num;
        int lastDigt,sum=0;
        while (n!=0){
            lastDigt=n%10;
            sum=sum+lastDigt;
            n=n/10;
        }
        System.out.println("the sum of all digts :"+num+" : "+sum);

    }
}
