package thread;

import java.util.IllegalFormatException;

/**
 * Created by teng on 18/2/26.
 */
public class JoinText {


    public static void main(String[] args) throws InterruptedException {

        Worker worker0 = new Worker("Worker0", (long) (Math.random()*2000+3000));
        Worker worker1 = new Worker("Worker1", (long) (Math.random()*2000+3000));
        Worker worker2 = new Worker("Worker2", (long) (Math.random()*2000+3000));

        worker0.start();
        worker1.start();

        // main 线程会wait,等待这个两个线程都执行完
        worker0.join();
        worker1.join();

        System.out.print("准备工作就绪\n");

        worker2.start();
    }

}
