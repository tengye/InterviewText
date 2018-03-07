package designPatterns.ProductCustomer;

import java.util.concurrent.*;

/**
 * Created by teng on 18/3/7.
 */
public class Client {

    public static void main(String[] args) {

        BlockingQueue<PcData> queue = new LinkedBlockingDeque<>();

        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Producer p3 = new Producer(queue);


        Customer c1 = new Customer(queue);
        Customer c2 = new Customer(queue);
        Customer c3 = new Customer(queue);


        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(p1);
        service.execute(p2);
        service.execute(p3);

        service.execute(c1);
        service.execute(c2);
        service.execute(c3);




    }

}
