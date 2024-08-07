import java.util.Scanner;
class BinarySearch {
     public int SearchTarget(int nums[], int target) {
         int left = 0;
         int right = nums.length - 1;

         while (left <= right) {
             int mid = left + (right - left) / 2;

             if (nums[mid] == target) {
                 return mid; // Target found
             } else if (nums[mid] < target) {
                 left = mid + 1; // Search in the right half
             } else {
                 right = mid - 1; // Search in the left half
             }
         }

         return -1;

 }
    public static void main(String args[])
    {
        int nums[] = {23,45,78,88,90};
        int target = 78;
        BinarySearch search = new BinarySearch();
        int index = search.SearchTarget(nums,target);
        if(index != -1)
        {
            System.out.println("Element  found:"+index);
        }
        else {
            System.out.println("Element not found");
        }

    }
}
