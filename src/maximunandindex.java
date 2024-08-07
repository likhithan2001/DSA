public class maximunandindex {
    public static void maxandindex(int arr[],int n)
    {
        int max = arr[0];
        int ind = 0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
                ind = i;
            }
        }
       System.out.println(max+" "+ind);


    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        maxandindex(arr,6);

    }
}
