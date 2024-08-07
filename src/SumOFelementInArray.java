public class SumOFelementInArray {
    public static void main(String args[])
    {
        int a[] = {5,6,7,4,3};
        int sum = 0;
//        for(int i = 0;i<a.length;i++)
//        {j
//            sum = sum + a[i];
//        }

        for(int e:a)
        {
            sum = sum+e;
        }
        System.out.println(sum);
    }
}
