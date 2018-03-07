package designPatterns.ProductCustomer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by teng on 18/3/7.
 */
public class Customer implements Runnable {

    BlockingQueue<PcData> queue;


    public Customer(BlockingQueue<PcData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        Random random = new Random();

        try {

            while (true){
                PcData pcData = queue.take();
                System.out.println("消费者消费了---->" + pcData.getIntData());
                if (pcData != null) {
                    Thread.sleep(random.nextInt(1000));
                }
            }

        }catch (Exception e){

        }


    }


}
