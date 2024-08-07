public class SunOfDivisor {
    public static void main(String args[])
    {
        int sum = 0;
        int n = 48;
        for(int i = 1;i<=n;i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of the n divisor:"+ sum);
    }
}
