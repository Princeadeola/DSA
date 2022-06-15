package List.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        Employee johnDoe = new Employee("John", "Doe", 113);
        Employee jamesSmith = new Employee("James", "Smith", 233);
        Employee janeDoe = new Employee("Jane", "Doe", 4563);
        Employee jackDoe = new Employee("Jack", "Doe", 3421);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(johnDoe);
        list.addToFront(jamesSmith);
        list.addToFront(janeDoe);
        list.addToFront(jackDoe);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill","End", 234);
        list.addToEnd(billEnd);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();

        list.printList();
        System.out.println(list.getSize());


    }
}
