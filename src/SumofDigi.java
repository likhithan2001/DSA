import java.util.Scanner;
public class SumofDigi {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0)
        {
            int lastd = num%10;
            sum = sum + lastd;
            num = num/10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}
