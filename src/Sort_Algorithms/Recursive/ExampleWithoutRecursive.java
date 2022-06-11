package Sort_Algorithms.Recursive;

//let say we are working to solve the factorial of any number

public class ExampleWithoutRecursive {
    public static void main(String[] args) {
        System.out.println("Without Recursive method: " + iterativeFactorial(3));
    }

    public static int iterativeFactorial(int num){

        if (num == 0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

