package Questions;

public class SortArray {
    public static void main(String[] args) {
        int[] intArr = {5,1,1,2,0,0};

        System.out.print("Array before sorted: ");
        for (int i: intArr) {
            System.out.print(i + ", ");
        }

        System.out.println();
        sortArray(intArr);

        System.out.print("Array After sorted: ");
        for (int i: intArr) {
            System.out.print(i + ", ");
        }
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]){
                    index = j;
                }
            }

            int newSort = nums[index];
            nums[index] = nums[i];
            nums[i] = newSort;
        }
        return nums;
    }
}
