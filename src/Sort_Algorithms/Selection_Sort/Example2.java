package Sort_Algorithms.Selection_Sort;

public class Example2 {
    public static void main(String[] args) {

        int[] myArrays = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.print("Array before sorted: ");
        for ( int i: myArrays) {
            System.out.print(i + ", ");
        }
        System.out.println();
        selectionSort(myArrays);

        System.out.print("Sorted Arrays: ");
        for (int i: myArrays) {
            System.out.print(i + ", ");
        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]){
                    index = j;
                }
            }

            int smallNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallNumber;
        }
    }
}
