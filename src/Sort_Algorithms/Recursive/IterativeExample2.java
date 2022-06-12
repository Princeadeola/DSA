package Sort_Algorithms.Recursive;

import java.util.Scanner;

public class IterativeExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fib value: ");
        int num = input.nextInt();

        int result = iterativeFibonacciSequence(num);
        System.out.println("The Fib of " + num + " = " + result);
    }

    public static int iterativeFibonacciSequence(int n){
        // This condition is known as breaking condition or base condition => if(n == 0)
        if (n <= 1){
            return n;
        }

        int F1, F2;
        int F = 0;
        F1 = 0;
        F2 = 1;

        for (int i = 2; i <= n; i++) {
            F = F1 + F2;
            F1 = F2;
            F2 = F;
        }
        return F;
    }
}
