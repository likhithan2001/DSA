import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbrer:");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1;i<= num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count == 2 || num == 1)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
