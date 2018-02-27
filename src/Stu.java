import java.util.Observable;

/**
 * Created by teng on 17/12/7.
 */
public class Stu extends Observable {
    void ask(String qus){
        setChanged();
        notifyObservers(qus);
    }

    class B extends A{

        @Override
        void d() {

        }
    }

    abstract class A{
        void c(){

        }
        abstract void d();
    }

}
