package Task1;

public class Enrollee {
    private String name;
    private int score;

    public Enrollee(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Task1.Enrollee{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
