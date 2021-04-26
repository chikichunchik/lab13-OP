package Task3;

import Task1.Enrollee;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static List<String> getLowScoreEnrollees(Collection<Enrollee> enrollees){
        return enrollees.stream()
                .filter(e -> e.getScore() < 60)
                .map(e -> e.getName())
                .collect(Collectors.toList());
    }
}
