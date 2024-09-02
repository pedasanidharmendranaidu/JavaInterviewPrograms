package javaProgramsArray;

public abstract class FindDuplicates {

    public static void main(String[] args) {
        int arr[] ={2,1,4,2,3,5,4,3,2,4,9,6,4,3,};

        findDuplicates(arr);


    }

    private static void findDuplicates(int[] arr) {


        for (int i = 0; i <arr.length ; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {


                if (arr[i]==arr[j] && (i>j)){
                    break;

                }
                if (arr[i]==arr[j]){
                    count++;

                }

            }
            if (count >1){
                System.out.println(+arr[i]+" :occurance of elements: "+count);
            }


        }

    }
}
