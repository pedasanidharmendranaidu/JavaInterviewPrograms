package javaOOPsPrograms;

public class JavaPro {
    public static void main(String[] args) {
        double d=9.99;
        int i=(int) d;
        System.out.println(i);
        System.out.println("*************************************");
        for (int j = 1; j <=5; j++) {
            for (int k = 1; k <=j ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("*************************");
        char f='f';
        switch (f){
            default :
                System.out.println("unknown");
            case 'p':
                System.out.println(" ppp");
            case 'k':
                System.out.println(" kkkk");
                break;

            case 's':
                System.out.println(" sss");

        }
    }
}
