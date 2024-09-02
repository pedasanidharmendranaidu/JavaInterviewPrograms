package javaProgramsArray;

import java.util.Scanner;

public class FindElementFirstLastOccurance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     //   int arr[] = new int[10];
       int[] arr={2,5,3,6,2,5,7,2,4,8,3,};

      /*  System.out.println("enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the element:  " + i);
            arr[i] = scanner.nextInt();
        }*/
        int element;

       // System.out.println("enter an element:  ");
        element = 2;
        findEleOcc12(arr, element);

    }

    private static void findEleOcc12(int[] arr, int element) {
        int first = -1, last = -1;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {
                if (!found) {
                    first = i;
                    last = i;
                    found = true;
                } else {
                    last = i;
                }
            }


        }
        if (found==false){
            System.out.println("element not presented::");
        }else {
            System.out.println("elements presented: "+first+"  : "+last);

        }

    }

}
