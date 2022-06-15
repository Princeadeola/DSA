package List.LinkedList.DoublyLinkedList;

public class Example1 {
    public static void main(String[] args) {

        Employee johnDoe = new Employee("John", "Doe", 113);
        Employee jamesSmith = new Employee("James", "Smith", 233);
        Employee janeDoe = new Employee("Jane", "Doe", 4563);
        Employee jackDoe = new Employee("Jack", "Doe", 3421);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println("Before adding element, list.isEmpty = " + list.isEmpty());

        list.addToFront(johnDoe);
        list.addToFront(jamesSmith);
        list.addToFront(janeDoe);
        list.addToFront(jackDoe);

        System.out.println("After adding element, list.isEmpty = " + list.isEmpty());

        System.out.println(list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
