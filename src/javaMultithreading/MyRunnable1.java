package javaMultithreading;

public class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Thread-1")){

            method1();
        }else {
            method2();
        }
    }

    static synchronized void method1() {
        System.out.println(Thread.currentThread().getName()+" : has started method1() :");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" : has ended method1() :");

    }

   static synchronized void method2() {
        System.out.println(Thread.currentThread().getName()+" : has started method2() :");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" : has ended method1() :");

    }
}
