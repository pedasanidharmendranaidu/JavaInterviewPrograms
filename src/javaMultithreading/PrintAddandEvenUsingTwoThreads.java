package javaMultithreading;

public class PrintAddandEvenUsingTwoThreads implements Runnable{
    int i=1;

    @Override
    public void run() {



        while (i<10){

            if (Thread.currentThread().getName().equals("thread-1")){

                if (i%2==1){

                    System.out.println(i++ + " : p1 : 1 "+" "+Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    System.out.println(i++ + " : p1 : 2 "+" "+Thread.currentThread().getName());

                }
               notify();

            } else if (Thread.currentThread().getName().equals("thread-2")) {
                if (i%2==0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i++ + " : p2 : 1"+" "+Thread.currentThread().getName());
notify();
                }else {
                    System.out.println(i++ + " : p2 : 2 "+" "+Thread.currentThread().getName());

                }

            }


        }





    }
}
