package javaProgramsEx;

public class MissingElemt {
    public static void main(String[] args) {
        int n=12;
        int[] a={1,6,7,8,5,3,2,9,10,11,12};

        int sumofnnumbers=sumofnnumbers(n);
        int sumofalltheelements = sumofalltheelements(a);

int missing= sumofnnumbers-sumofalltheelements;
        System.out.println(missing);

    }

    private static int sumofnnumbers(int n) {
        int sum=n*(n+1)/2;
        return sum;
    }

    private static int sumofalltheelements(int[] a) {
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i];
        }

        return sum;
    }
}
