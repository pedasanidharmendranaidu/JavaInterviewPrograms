package javaProgramsEx;

import java.util.Arrays;

public class SepateZerosFromNonZeos {

    public static void main(String[] args) {
        int arr[] = {1, 4, 0, 3, 7, 2, 4, 0, 0, 9, 6, 4, 3, 2};


        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while (count<arr.length){
            arr[count]=0;
            count++;

        }
      //   Arrays.toString(arr);
      //  String string = arr.toString().toString();
     //   System.out.println(string.getBytes().toString());
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }


}
