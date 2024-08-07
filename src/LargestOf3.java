import java.util.Scanner;
public class LargestOf3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first num:");
        int a = sc.nextInt();

        System.out.println("Enter a second num:");
        int b = sc.nextInt();

        System.out.println("Enter a third num:");
        int c = sc.nextInt();

        //Approach1
        if(a > b && a>c)
        {
            System.out.println(a+" largest");
        }
        else if(b > a && b > c)
        {
            System.out.println(b+" Largest");
        }
        else
        {
            System.out.println(c+" Largest");
        }

    }
}
