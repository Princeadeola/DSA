package Search_Algorithm.Binary_Search;

public class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

        System.out.println(iterativeSearch(intArray, -15));
        System.out.println(iterativeSearch(intArray, 35));
        System.out.println(iterativeSearch(intArray, 7));
        System.out.println(iterativeSearch(intArray, 123));
        System.out.println(iterativeSearch(intArray, 1));

    }

    public static int iterativeSearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){
            int midpoint = (start + end) / 2;
            System.out.println("Midpoint = " + midpoint);
            if (input[midpoint] == value){
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }

        return -1;
    }
}
