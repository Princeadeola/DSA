package Search_Algorithm.Binary_Search;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

        System.out.println(recursiveSearch(intArray, -15));
        System.out.println(recursiveSearch(intArray, 35));
        System.out.println(recursiveSearch(intArray, 7));
        System.out.println(recursiveSearch(intArray, 123));
        System.out.println(recursiveSearch(intArray, 1));

    }

    public static int recursiveSearch(int[] input, int value){
        return recursiveSearch(input, 0, input.length, value);
    }

    public static int recursiveSearch(int[] input, int start, int end, int value){
        if (start >= end){
            return -1;
        }

        int midpoint = (start + end) / 2;
        System.out.println("midpoint = " + midpoint);

        if (input[midpoint] == value){
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveSearch(input, midpoint + 1, end, value);
        }else {
            return recursiveSearch(input, start, midpoint, value);
        }
    }
}
