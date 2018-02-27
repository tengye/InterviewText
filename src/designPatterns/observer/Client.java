package designPatterns.observer;

/**
 * Created by teng on 18/2/27.
 */
public class Client {

    public static void main(String[] args) {

        TeacherSubject subject = new TeacherSubject();

        StudentObserver observer1 = new StudentObserver("1号选手", subject);
        StudentObserver observer2 = new StudentObserver("2号选手",subject);
        StudentObserver observer3 = new StudentObserver("3号选手",subject);


        subject.sendMessage(" 牛顿定律背十遍！");

    }

}
