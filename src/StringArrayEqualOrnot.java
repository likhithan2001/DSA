import java.util.Arrays;

public class StringArrayEqualOrnot {
    public static void main(String args[])
    {
        String arr1[] = {"ab","c"};
        String arr2[] = {"ab","c"};
        boolean status = Arrays.equals(arr1,arr2);
        if(status == true)
        {
            System.out.println("String arrays are equal");
        }
        else {
            System.out.println("String arrays are not equal");
        }

    }
}
