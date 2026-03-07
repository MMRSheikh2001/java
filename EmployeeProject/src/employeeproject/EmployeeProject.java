package employeeproject;

import employeeproject.dao.EmployeeDao;
import employeeproject.model.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class EmployeeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Employee e= new Employee("Mahbub", 12000, "mahbub@gmail.com");
//        EmployeeDao ed= new EmployeeDao();
//        ed.saveStudentData(e);

        List<Employee> eList = new ArrayList<>();
        EmployeeDao ed = new EmployeeDao();
        eList = ed.findAllStudent();
        System.out.println(eList);

    }

}
