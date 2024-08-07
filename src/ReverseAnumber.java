import java.util.Scanner;
public class ReverseAnumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        //logic 1
//        int rev = 0;
//        while(num != 0)
//        {
//            int lasd = num % 10;
//            rev = (rev*10) + lasd;
//            num = num/10;
//        }
//        System.out.println(rev);
//        StringBuffer rev;
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        rev = sb.reverse();
//        System.out.println("Reverse Number is:"+rev);

         StringBuilder rev = new StringBuilder();
         rev.append(num);
         rev.reverse();
         System.out.println("Reverse Number is:"+rev);

    }
}
