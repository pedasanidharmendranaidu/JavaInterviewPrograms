package javaProgramsEx;

public class OperatorOverload {

    public static void main(String[] args) {
        System.out.println(1+2+3+""+1+""+1+2+3+"");//61123
        System.out.println(""+1+2+3+4+" "+5+5+5+" ");//1234555
        System.out.println(""+1+2+3+4+5+6+7);//1234567
        System.out.println(+1+2+3+4+5+6-7+" ");//14
        System.out.println(+1+2+3+4/5+6+7+"");//19
        System.out.println(+1+2+3+""+4+5+6+7);//64567
        System.out.println(2+1+""+" "+1);//31
    }


}
