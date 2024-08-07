import java.util.Scanner;

class MaximumSubArray {

    public int maxSubArray(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            max = Math.max(max,sum);
            if(sum == 0)
            {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in the arrays:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<n;i++)
        {
            nums[i] = sc.nextInt();

        }
        MaximumSubArray col = new MaximumSubArray();
        int maxsum = col.maxSubArray(nums);
        System.out.println(maxsum);

    }
}
