public class MatrixSearch {
    public static boolean searchMtarget(int[][] matrix,int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high = row*col -1;
        while(low<= high)
        {
            int mid = (low+high)/2;
            if(matrix[mid/col][mid%col] == target)
            {
                return true;
            }
            else if(matrix[mid/col][mid%col]<target)
            {
                low = mid+1;
            }
            else {
                high = mid -1;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 10;
        boolean index = searchMtarget(matrix,target);
//        if(index != false)
//        {
           System.out.println("Index element:"+index);
//        }
//        else{
//            System.out.println("Index not found");
//        }
    }
}
