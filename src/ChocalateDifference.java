import java.util.Arrays;

public class ChocalateDifference {
    public static int main(String args[])
    {
        int arr[] = {3,4,1,9,56,7,9,12};
        int m = 5;
        int n = arr.length;
        if(n ==0 || m ==0)
            return 0;
        Arrays.sort(arr);
        if(n<m)
        {
            return -1;
        }
        int min_diff = Integer.MAX_VALUE;
        for(int i =0;i+m-1<n;i++)
        {
            int diff = arr[i+m-1]-arr[i];
            if(diff <min_diff)
            {
                min_diff = diff;
            }
        }
        System.out.println(min_diff);

        return 0;
    }

}
