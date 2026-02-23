package genericsusefeb23;

import genericsusefeb23.cllass.Student;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GenericsUseFeb23 {

    public static void main(String[] args) {

        ArrayList<Student> sList = new ArrayList<>();

        sList.add(new Student(1, "Mahbub", "mahbub@gmail.com"));

        Student s1 = new Student(2, "Sabbir", "sabbir@gmail.com");
        sList.add(s1);
        System.out.println(sList);
        sList.forEach((Student item) -> {
            System.out.println(item);
        });

    }

}
