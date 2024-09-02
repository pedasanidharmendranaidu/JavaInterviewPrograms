package javaProgramsEx;

public class SecLargeNumFromArr {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 3, 5, 7, 11,12,3, 9, 6, 4, 3, 3, 6, 6, 8,};

        secLarge(arr);


    }

    private static void secLarge(int[] arr) {

        int first=0,second=0;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i]>first){
                second=first;
                first=arr[i];

            }else if (arr[i]>second){
                second=arr[i];
            }


        }
        System.out.println("first large: "+first);
        System.out.println("sec large: "+second);

    }
}
