package javaMultithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("method in run() from 1");
        System.out.println("current thread name : "+Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        System.out.println("method in main() from 1");
        System.out.println("current thread name : "+Thread.currentThread().getName());

        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();

    }
}
