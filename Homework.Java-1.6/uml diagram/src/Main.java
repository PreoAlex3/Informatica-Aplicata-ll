import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Address studentAddress1 = new Address("Strada Florilor", "Craiova", 12);
        Address studentAddress2 = new Address("Strada Margaretelor", "Arad", 35);
        Student student1 = new Student("Popescu Andrei", studentAddress1);
        Student student2 = new Student("Vasile Mihai", studentAddress2);
        Address adresaProfesor = new Address("Strada Libertății", "Timis", 3);
        Teacher profesor1 = new Teacher("Ionescu", adresaProfesor, "Java Programming");
        students.add(student1);
        students.add(student2);
        teachers.add(profesor1);
        Course curs1 = new Course("Informatica aplicata 2", students, teachers);
        curs1.addStudentToCourse(student1);
        curs1.prt(curs1,students, teachers);
    }
}