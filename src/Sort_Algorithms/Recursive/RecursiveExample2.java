package Sort_Algorithms.Recursive;

import java.util.Scanner;

public class RecursiveExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fib value: ");
        int num = input.nextInt();

        int result = recursiveFibonacciSequence(num);
        System.out.println("The Fib of " + num + " = " + result);
    }

    public static int recursiveFibonacciSequence(int n){
        System.out.println("I am calculating F" + n);
        // This condition is known as breaking condition or base condition => if(n == 0)
        if (n <= 1){
            return n;
        }
        int fib = recursiveFibonacciSequence(n-1) + recursiveFibonacciSequence(n - 2);
        System.out.println("Done! F" + n + " = " + fib);
        return fib;
    }
}
