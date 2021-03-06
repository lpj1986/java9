package win.elegentjs.concurrent.future;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * FutureTask也可以实现闭锁的效果：即等待线程执行完成才能通过
 */
public class FutureSample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(() -> {return "hello";});

        new Thread(futureTask).start();

        System.out.println("doSomething");

        String s = futureTask.get();

        System.out.println("result : " + s);

    }
}






