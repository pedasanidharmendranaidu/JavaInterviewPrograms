package DeadLockMultiThread;

public class A extends Thread{

    @Override
    public void run() {
        synchronized (Object.class){
            System.out.println("current class name:from Object  A "+Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (String.class){
                System.out.println("current class name: from String A "+Thread.currentThread().getName());

            }
        }
    }
}
