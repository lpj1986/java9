package win.elegentjs.concurrent.basic;

@SuppressWarnings("all")
public class WaitAndNotifySample {


    public void doWait() {
        synchronized (this) {

            try {
                System.out.println("wait ... , Thread Name: " + Thread.currentThread().getName());
                this.wait();
                System.out.println("I walk up, Thread Name: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void doNotify() {
        synchronized (this) {
            this.notifyAll();

            System.out.println("notify ... , ThreadName: " + Thread.currentThread().getName());

        }
    }


    public static void main(String[] args) throws InterruptedException {
        WaitAndNotifySample o = new WaitAndNotifySample();


        Thread t1 = new Thread(() -> o.doWait(), "thread1");
        Thread t2 = new Thread(() -> o.doWait(), "thread2");
        Thread t3 = new Thread(() -> o.doNotify(), "thread3");

        t1.start();
        t2.start();
        t3.start();

    }


}
