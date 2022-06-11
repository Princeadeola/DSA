package Search_Algorithm.Linear_Search;

public class Example1 {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(LinearSearch(intArray, -15));
        System.out.println(LinearSearch(intArray, 1));
        System.out.println(LinearSearch(intArray, 21));
        System.out.println(LinearSearch(intArray, -22));
    }

    public static int LinearSearch(int[] input, int value){
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value){
                return i;
            }
        }

        return -1;
    }
}
