package javaProgramstrickyForInrws;

public class FindPairsOfGivenSum {

    public static void main(String[] args) {
        int[] arr={1,2,5,3,4,2,1,3,2,1,4,2,3,3,4,1};

        int sum=6;

        findPairSum(arr,sum);
    }

    private static void findPairSum(int[] arr,int sum) {
int pairCount=0;

        for (int i = 0; i <arr.length ; i++) {
            {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==sum){
                    System.out.println("First: "+ i+": second: "+(j)+" :Index positions: "+arr[i]+" : "+arr[j]+ " sum = "+sum);
                    pairCount++;
                }

            }
        }

        }

        System.out.println(pairCount);

    }


}
