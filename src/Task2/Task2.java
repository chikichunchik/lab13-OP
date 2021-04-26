package Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Task2 {
    public static Collection<Student> moreThanAverageStudents(Institute institute){
        ArrayList<Faculty> faculties = institute.getFaculties();
        ArrayList<Student> students = new ArrayList<>();
        faculties.stream()
                .map(Faculty::getStudents)
                .flatMap(Collection::stream)
                .forEach(students::add);
        int averageScore = countAverage(students);
        return students.stream()
                .filter(s -> s.getScore() > averageScore)
                .collect(Collectors.toList());
    }
    private static int countAverage(Collection<Student> students){
        int studentsNumber = students.size();
        ArrayList<Integer> scoreSum = new ArrayList<>();
        scoreSum.add(0);
        students.stream()
                .forEach(s -> scoreSum.set(0, scoreSum.get(0) + s.getScore()));
        return scoreSum.get(0)/studentsNumber;
    }
}
