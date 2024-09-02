package javaProgramstrickyForInrws;

public class FindDupArrOneIteration {
    public static void main(String[] args) {
       int arr[]={1,3,1,4,3,2,34,2,1};
       findDupOneItr(arr);


    }

    private static void findDupOneItr(int[] arr) {

        int tempArr[]= new int[100];

        for (int i = 0; i <arr.length ; i++) {
            if (tempArr[arr[i]]==0){
                tempArr[arr[i]]=1;
            }else {
                System.out.print(arr[i]+" ");
            }

        }





    }

}
