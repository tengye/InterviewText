package designPatterns.observer;

import java.util.ArrayList;

/**
 * Created by teng on 18/2/27.
 */
public class TeacherSubject implements Subject {

    private ArrayList<Observer> observers;

    public TeacherSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(zuoye);
        }
    }

    private String zuoye;

    public void sendMessage(String zuoye){
        System.out.println("发作业喽");
        this.zuoye = zuoye;
        this.notifyObservers();
    }

}
