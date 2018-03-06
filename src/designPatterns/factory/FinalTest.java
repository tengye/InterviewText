package designPatterns.factory;

import java.util.Random;

/**
 * Created by teng on 18/2/28.
 */
public class FinalTest {

    public FinalTest() {
        System.out.println("con");
    }

    static {
        System.out.println("FinalTest static block");
        FinalTest.x = 88;
    }

    public static int x =6/3;

}
