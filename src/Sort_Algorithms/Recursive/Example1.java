package Sort_Algorithms.Recursive;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Factorial value: ");
        int num = input.nextInt();

        int result = recursiveCall(num);
        System.out.println("The factorial of " + num + " = " + result);
    }

    public static int recursiveCall(int value){
        System.out.println("I am calculating F" + value);
        if (value == 0){
            return 1;
        }

        int F = value * recursiveCall(value - 1);
        System.out.println("Done! F" + value + " = " + F);
        return F;

    }
}
