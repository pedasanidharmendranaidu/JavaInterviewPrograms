package javaProgramsArray;

public class FactoRecursion
{

    public static void main(String[] args) {
        // n=5 1*2*3*4*5 =120
        int n=5;
        System.out.println(" the number : "+n+"facto is: "+facto(n));
    }

    private static long facto(int n) {
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=fact*i;
        }

        return fact;
    }
}
