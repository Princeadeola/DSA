package List.Vector;

import java.util.List;
import java.util.Vector;

public class Example1 {
    public static void main(String[] args) {
        // Array List and vectors are pretty much the same, only that vector is
        // synchronised and arrayList is not

        List<EmployeeEx1> employeeList = new Vector<>();

        employeeList.add(new EmployeeEx1("John", "Doe", 113));
        employeeList.add(new EmployeeEx1("James", "Smith", 233));
        employeeList.add(new EmployeeEx1("Jane", "Doe", 4563));
        employeeList.add(new EmployeeEx1("Jack", "Doe", 3421));


    }
}
