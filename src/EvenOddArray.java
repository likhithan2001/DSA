public class EvenOddArray {
    public static void main(String args[])
    {
        int a[] = {2,3,4,5,6,7};
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]%2 == 0)
            {
                System.out.println("Even numbers:"+a[i]); //Even number
            }

        }
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]%2 != 0)
            {
                System.out.println("Odd numbers:"+a[i]); //Odd number
            }
        }
    }
}
