public class OccurenceOfNumber {
    public static int countOccurence(int arr[],int element)
    {
        int count = 0;
        for(int num:arr)
        {
            if(num == element)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        int arr[] = {5,2,4,1,2};
        int element = 2;
        int result = countOccurence(arr,element);
        System.out.println("Occurence of the element:"+result);



    }
}
