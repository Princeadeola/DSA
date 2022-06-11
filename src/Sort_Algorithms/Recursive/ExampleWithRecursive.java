package Sort_Algorithms.Recursive;

public class ExampleWithRecursive {
    public static void main(String[] args) {
        System.out.println("Recursive Method: " + recursiveFactorial(5));
    }

    public static int recursiveFactorial(int num){

        if (num == 0){
            return 1;
        }

        // n! = n * (n - 1)!
        return num * recursiveFactorial(num - 1);
    }
}
