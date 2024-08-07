import java.util.*;
public class NumberOfDigits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0)
        {
//           int last = num%10;
            num = num/10;
            count++;
            //num = num/10;
        }
        System.out.println("Count of numbers:"+count);
    }
}
