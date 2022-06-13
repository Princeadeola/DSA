package List.ArrList;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<EmployeeEx1> employees = new ArrayList<>();

        employees.add(new EmployeeEx1("John", "Doe", 113));
        employees.add(new EmployeeEx1("James", "Smith", 233));
        employees.add(new EmployeeEx1("Jane", "Doe", 4563));
        employees.add(new EmployeeEx1("Jack", "Doe", 3421));

        employees.forEach(employee -> System.out.println(employee));
    }
}
