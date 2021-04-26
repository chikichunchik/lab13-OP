package Task2;

import java.util.ArrayList;

public class Faculty {
    private ArrayList<Student> students;

    public Faculty() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
