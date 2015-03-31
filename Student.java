package StudentDB;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Student {
    String firstName, lastName;
    public Integer ID;
    String email;
    ArrayList<Course> courses = new ArrayList<Course>();

    public Student(String firstName, String lastName, int ID, String email, ArrayList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.email = email;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public Iterator getCourseIterator() {
        Iterator<Course> CourseIterator = courses.iterator();
        return CourseIterator;
    }

    class Course {
        String name;
        String description;
        String grade;

        public Course(String n, String desc, String g) {
            name = n;
            description = desc;
            grade = g;
        }

        @Override
        public String toString() {
            return name + " grade: " + grade;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }
}
