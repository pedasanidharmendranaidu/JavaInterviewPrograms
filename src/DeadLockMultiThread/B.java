package DeadLockMultiThread;

public class B extends Thread{
    @Override
    public void run() {
        synchronized (String.class) {
            System.out.println("current class name: from Object B " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Object.class) {
                System.out.println("current class name: from String B " + Thread.currentThread().getName());

            }
        }
    }
}
