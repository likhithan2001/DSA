import java.util.Arrays;
import java.util.Scanner;

public class MinimumPenalty {
    public static int penalty(int arr[], int n) {
        int sum = 0;
        Arrays.sort(arr);  // Sort the array in ascending order
        for (int i = 1; i < n; i++) {
            sum += Math.abs(arr[i] - arr[i - 1]);  // Calculate the sum of absolute differences
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = sc.nextInt();

        // Check for a valid number of elements
        if (n <= 0) {
            System.out.println("The number of elements must be positive.");
            return;
        }

        System.out.println("Enter the array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = penalty(arr, n);
        System.out.println("The minimum penalty is: " + ans);
    }
}
