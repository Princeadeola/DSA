package List.LinkedList;

public class Example1 {
    public static void main(String[] args) {

        Employee johnDoe = new Employee("John", "Doe", 113);
        Employee jamesSmith = new Employee("James", "Smith", 233);
        Employee janeDoe = new Employee("Jane", "Doe", 4563);
        Employee jackDoe = new Employee("Jack", "Doe", 3421);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(johnDoe);
        list.addToFront(jamesSmith);
        list.addToFront(janeDoe);
        list.addToFront(jackDoe);

        System.out.println(list.getSize());

        list.printList();

    }
}
