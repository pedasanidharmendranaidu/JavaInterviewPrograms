package javaMultithreading;

public class MyRunnableClassImp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" has started:::");

        MyRunnable1 myRunnable1=new MyRunnable1();
     //   MyRunnable1 myRunnable2=new MyRunnable1();
        Thread thread=new Thread(myRunnable1,"Thread-1");
        Thread thread1=new Thread(myRunnable1,"Thread-2");

        thread.start();
        Thread.sleep(100);
        thread1.start();


    }
}
