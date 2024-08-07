public class SumOfNaturalNumbers {
    public static int getSum(int n)
    {
        if(n == 0)
            return n;
        return n + getSum(n-1);
    }
    public static void main(String args[])
    {
        int n = 10;
        System.out.println(getSum(n));
    }
}
