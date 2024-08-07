public class FindSquareRootOrnot {
    public static int perfect_square(int arr[],int n)
    {
        int count = 0;
        for(int i =0;i<n;i++)
        {
            if(Math.ceil(Math.sqrt(arr[i])) == Math.floor(Math.sqrt(arr[i])))
            {
                count++;
            }
        }
        return count++;
    }
    public static void main(String agrs[])
    {
        int arr[] = {64,16,38,81,50,100};
        int ans = perfect_square(arr,6);
        System.out.println(ans);
    }
}
