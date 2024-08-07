public class MissingNumberInArray {
    public static void main(String args[])
    {
        //Array should not have duplicates
        //Array No need to be sorted order
        //Values should be in range
        int a[] = {1,2,4,5};
        int sum1 = 0;
        for(int i = 0;i<a.length;i++)
        {
            sum1 = sum1 + a[i];
        }
        int sum2 = 0;
        for(int i = 1;i<=5;i++) // n = n*(n+1)/2
        {
            sum2 = sum2 + i;
        }
        int missingValue = sum2 - sum1;
        System.out.println("Missing number is:"+missingValue);
    }
}
