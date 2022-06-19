package List.LinkedList.JDKLinkedList;


import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee johnDoe = new Employee("John", "Doe", 113);
        Employee jamesSmith = new Employee("James", "Smith", 233);
        Employee janeDoe = new Employee("Jane", "Doe", 4563);
        Employee jackDoe = new Employee("Jack", "Doe", 3421);
        Employee billEnd = new Employee("Bill", "End", 321);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(johnDoe);
        list.addFirst(jamesSmith);
        list.addFirst(janeDoe);
        list.addFirst(jackDoe);

        Iterator iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<-->");
        }
        System.out.println("null");

        list.add(billEnd); // add works as he same as addLast


        iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<-->");
        }
        System.out.println("null");

        list.remove(); // remove first item, not last
        iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<-->");
        }
        System.out.println("null");

    }
}
