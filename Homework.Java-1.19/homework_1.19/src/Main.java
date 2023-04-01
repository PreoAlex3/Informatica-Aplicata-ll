import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList students = new ArrayList<>();
        Student student1= new Student("Mihai",5);
        Student student2= new Student("Andrei",6);
        Student student3= new Student("Nicoleta",10);
        Student student4= new Student("Ionut",7);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        Collections.sort(students, new NoteComparator());
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

    }
}