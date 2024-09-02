package javaMultithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("method in run()");
        System.out.println("current thread name : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("method in main()");
        System.out.println("current thread name : "+Thread.currentThread().getName());

        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        System.out.println("method in main()");
        System.out.println("current thread name : "+Thread.currentThread().getName());

    }
}





