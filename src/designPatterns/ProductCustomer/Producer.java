package designPatterns.ProductCustomer;

import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by teng on 18/3/7.
 */
public class Producer implements Runnable {
    // 生产者
    private BlockingQueue<PcData> queue;
    private boolean isRunning = true;
    private AtomicInteger count = new AtomicInteger();


    public Producer(BlockingQueue<PcData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        PcData pcData = null;
        Random random = new Random();
        try {
            while (isRunning) {
                Thread.sleep(random.nextInt(1000));
                pcData = new PcData(count.incrementAndGet());
                System.out.println("生成者生产了---->" + pcData.getIntData());
                // 加入队列
                if (queue.offer(pcData, 2, TimeUnit.SECONDS)){

                }

            }
        }catch (Exception e){

        }

    }

    public void stop() {
        isRunning = false;
    }
}
