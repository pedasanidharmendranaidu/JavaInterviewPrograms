package javaProgramstrickyForInrws;

public class AmstrangNumber {

    public static void main(String[] args) {

        //1(cube)+5(cube)+3(cube)=153

       // int num=153;
        int num=370;

        int amstrng=amstringNumOrNot(num);
        if(num==amstrng){
            System.out.println("number is amstrang: "+amstrng);
        }else {
            System.out.println("number is not a amstrang: "+amstrng);
        }

    }

    private static int amstringNumOrNot(int num) {
        int lastdgt=0;
        int sum=0;

        while (num!=0){
           lastdgt= num%10;
           sum=sum+lastdgtCube(lastdgt);//(lastdgt*lastdgt*lastdgt)
           num/=10;

        }
        return sum;
    }

    private static int lastdgtCube(int lastdgt) {
        int last=1;
        for (int i = 0; i <3 ; i++) {
            last=last*lastdgt;


        }
        return last;
    }


}
