package javaProgramsArray;

public class FactorialNumber {

    public static void main(String[] args) {
        int num=10;
        int fact=1;

        for (int j = 1; j <=num ; j++) {
            fact= fact*j;
        }


        System.out.println(fact);
    }
}
