package List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<EmployeeEx1> employeeList = new ArrayList<>();

        employeeList.add(new EmployeeEx1("John", "Doe", 113));
        employeeList.add(new EmployeeEx1("James", "Smith", 233));
        employeeList.add(new EmployeeEx1("Jane", "Doe", 4563));
        employeeList.add(new EmployeeEx1("Jack", "Doe", 3421));

//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(2, new EmployeeEx1("Adams", "Jane", 5346));
//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.size());
//
        employeeList.add(3, new EmployeeEx1("Micheal", "Kevin", 5346));
//        employeeList.forEach(employee -> System.out.println(employee));

//        EmployeeEx1[] employeeArray = employeeList.toArray(new EmployeeEx1[employeeList.size()]);
//        for (EmployeeEx1 employee: employeeArray) {
//            System.out.println(employee);
//        }

        System.out.println(employeeList.contains(new EmployeeEx1("John","Doe",113)));

        System.out.println(employeeList.indexOf(new EmployeeEx1("Micheal","Kevin",5346)));

        System.out.println("Before removing the element");
        employeeList.forEach(employee -> System.out.println(employee));
        employeeList.remove(4);
        System.out.println("After removing the element");
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
