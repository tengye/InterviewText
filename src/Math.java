import java.util.Observable;
import java.util.Observer;

/**
 * Created by teng on 17/12/7.
 */
public class Math implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
