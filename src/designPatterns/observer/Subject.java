package designPatterns.observer;


/**
 * Created by teng on 18/2/27.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
