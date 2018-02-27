package designPatterns.observer;

/**
 * Created by teng on 18/2/27.
 */
public class StudentObserver implements Observer {

    TeacherSubject teacherSubject;

    private String studentName;

    public StudentObserver(String studentName, TeacherSubject teacherSubject) {
        this.studentName = studentName;
        this.teacherSubject = teacherSubject;
        teacherSubject.registerObserver(this);
    }

    @Override
    public void update(String zuoye) {
        System.out.println(studentName+zuoye);
    }

}
