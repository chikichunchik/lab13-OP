package Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Task1 {
    public static Collection<Enrollee> getBudgetStudents(Collection<Enrollee> enrollees, int budget){
        ArrayList<Enrollee> result = new ArrayList<>();
        enrollees.stream()
                .filter(e -> e.getScore() >= 60)
                .sorted((e1, e2) -> e2.getScore() - e1.getScore())
                .limit(budget)
                .sorted(Comparator.comparing(Enrollee::getName))
                .forEach(result::add);

        return result;
    }
}
