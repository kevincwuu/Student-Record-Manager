package StudentDB;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentRecordManager {
    ArrayList<Student> studentList = new ArrayList<Student>();

    public void add(Student s) {
        studentList.add(s);
    }

    public void remove(int id) {
        if(search(id) != null){
            studentList.remove(id);
        }
    }

    public Student search(int id) {
        Student student = null;
        for (Student stu : studentList) {
            if (stu.getID() == id) {
                System.out.println(stu.getFirstName() + " " + stu.getLastName() + ": " + stu.getID());
                student = stu;
                break;
            }
        }
        return student;
    }

    public void addCourse(int id, Student.Course course) {
        if(search(id) != null) {
            search(id).courses.add(course);
        }
    }

    public void removeCourse(Student s, Student.Course course) {
        if (s.courses.contains(course)) {
            s.courses.remove(course);
        }
    }

    public Iterator getInterator() {
        Iterator<Student> studentIterator = studentList.iterator();
        /*while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }*/
        return studentIterator;
    }
}
