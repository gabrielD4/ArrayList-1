import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>(List.of(new Student("Gabriel", 31),
                new Student("Linda", 28)));
        System.out.println(studentsList);

        studentsList.add(new Student("Manuel", 26));
        studentsList.add(new Student("Sergio", 29));
        studentsList.add(new Student("Sarah", 22));
        studentsList.add(new Student("Ludovica", 25));
        System.out.println(studentsList);

    }
}