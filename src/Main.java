import Task1.Enrollee;
import Task1.Task1;
import Task2.*;
import Task3.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Task 1
        ArrayList<Enrollee> enrollees = new ArrayList<>();
        enrollees.add(new Enrollee("Ivan", 0));
        enrollees.add(new Enrollee("David", 59));
        enrollees.add(new Enrollee("Igor", 99));
        enrollees.add(new Enrollee("Lena", 80));
        enrollees.add(new Enrollee("Anya", 98));
        System.out.println("Task 1: \n" + Task1.getBudgetStudents(enrollees, 2) + "\n");

        // Task 2
        Institute kpi = new Institute();
        Faculty fict = new Faculty();
        Faculty fmm = new Faculty();
        fict.addStudent(new Student("Igor", 100));
        fict.addStudent(new Student("Vlad", 50));
        fmm.addStudent(new Student("Lena", 0));
        fmm.addStudent(new Student("Sonya", 50));
        kpi.addFaculty(fict);
        kpi.addFaculty(fmm);
        System.out.println("Task 2: \n" + Task2.moreThanAverageStudents(kpi) + "\n");

        // Task 3
        System.out.println("Task 3: \n" + Task3.getLowScoreEnrollees(enrollees) + "\n");
    }
}
