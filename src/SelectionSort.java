import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selection(int arr[],int n)
    {
        for(int i =0;i<=n-2;i++) {
            int mini = i;
            for (int j = i; j <= n - 1; j++) {
                if(arr[j] < arr[mini])
               {
                   mini = j;
               }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }


    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter a array:");
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        selection(arr,n);
        for(int i =0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }
}

