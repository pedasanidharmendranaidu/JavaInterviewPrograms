package javaMultithreading;

public class ClassAddEven {

    public static void main(String[] args) {

        Thread thread1=new Thread(new PrintAddandEvenUsingTwoThreads(),"thread-1");
        Thread thread2=new Thread(new PrintAddandEvenUsingTwoThreads(),"thread-2");
thread1.start();
thread2.start();
    }
}
