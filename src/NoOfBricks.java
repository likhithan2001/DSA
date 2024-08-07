import java.util.Scanner;
public class NoOfBricks {
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int ans = n*(3*n+1)/2;

        System.out.println("No of bricks for n numbers:"+ans);
    }

}
