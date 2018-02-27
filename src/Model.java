import java.util.Observable;
import java.util.Observer;

/**
 * Created by teng on 17/12/7.
 */
public class Model {

    public static void main(String[] args) {
        Stu stu = new Stu();

        Math math = new Math();

        stu.addObserver(math);

        stu.ask("Are you sha bi?");
    }
}
