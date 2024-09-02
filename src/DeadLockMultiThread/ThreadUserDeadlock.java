package DeadLockMultiThread;

public class ThreadUserDeadlock {

    public static void main(String[] args) {
        Thread thread1=new Thread(new A(),"Thrad-1");
        Thread thread2=new Thread(new B(),"Thrad-2");

        thread1.start();
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();

    }

}
