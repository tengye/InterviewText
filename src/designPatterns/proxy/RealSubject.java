package designPatterns.proxy;

/**
 * Created by teng on 18/1/10.
 */

public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.print("RealSubject");
    }
}
