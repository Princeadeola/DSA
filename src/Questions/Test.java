package Questions;

// Java code to implement the above approach
import java.io.*;
class Test {
//
    public static void main(String[] args) {
        int n = 14, k = 2;
        System.out.println(Josephus(n, k));
    }

    public static int Josephus(int n, int k)
    {
        k--;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1; // Makes all the 'n' people alive by
            // assigning them value = 1
        }
        int cnt = 0, cut = 0, num = 1; // Cut = 0 gives the sword to 1st person.
        while (cnt < (n - 1)) // Loop continues till n-1 person dies.
        {
            while (num <= k) // Checks next (kth) alive persons.
            {
                cut++;
                cut = cut
                        % n; // Checks and resolves overflow
                // of Index.
                if (arr[cut] == 1) {
                    num++; // Updates the number of persons
                    // alive.
                }
            }
            num = 1; // refreshes value to 1 for next use.
            arr[cut] = 0; // Kills the person at position of
            // 'cut'
            cnt++; // Updates the no. of killed persons.
            cut++;
            cut = cut % n; // Checks and resolves overflow
            // of Index.
            while (arr[cut]
                    == 0) // Checks the next alive person the
            // sword is to be given.
            {
                cut++;
                cut = cut
                        % n; // Checks and resolves overflow
                // of Index.
            }
        }
        return cut
                + 1; // Output is the position of the last
        // man alive(Index + 1);
    }
}

// This code is contributed by Shubham Singh

