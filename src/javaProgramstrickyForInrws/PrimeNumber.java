package javaProgramstrickyForInrws;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int n = 0; n <= 100; n++) {


            boolean prime = findPrime(n);
            if (prime)
                System.out.print(" " + n);

        }


    }

    private static boolean findPrime(int n) {
        if (n == 1 || n == 0)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;


        //   return true;
    }

}
