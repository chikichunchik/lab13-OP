package Task2;

import java.util.ArrayList;

public class Institute {
    private ArrayList<Faculty> faculties;

    public Institute() {
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }
}
