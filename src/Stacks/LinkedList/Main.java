package Stacks.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee johnDoe = new Employee("John", "Doe", 113);
        Employee jamesSmith = new Employee("James", "Smith", 233);
        Employee janeDoe = new Employee("Jane", "Doe", 4563);
        Employee jackDoe = new Employee("Jack", "Doe", 3421);

        LinkedStack stack = new LinkedStack();
        stack.push(johnDoe);
        stack.push(jamesSmith);
        stack.push(janeDoe);
        stack.push(jackDoe);

        System.out.println("Peeked: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        stack.printStack();
        System.out.println("After peeked and popped");

        System.out.println("Peeked: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.printStack();

    }
}
