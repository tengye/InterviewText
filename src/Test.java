import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by teng on 17/5/10.
 */
public class Test {



    public static void main(String[] args) throws InterruptedException {
//        new A("a").start();
//        new A("b").start();

        System.out.print("foo --> "+foo(6));

    }

    public synchronized void print(String a){
        for (int i = 0; i < 100; i++) {
            System.out.println("i= " + a);
        }
    }

    static class A extends Thread{

        String a;

        public A(String a) {
            this.a = a;
        }

        @Override
        public void run() {
            super.run();

            new Test().print(a);
        }
    }

    public static int foo(int n){
        if (n < 2){
            return n;
        }else {
            int i = foo(n - 1) + foo(n - 2);
            return i;
        }
    }

}
