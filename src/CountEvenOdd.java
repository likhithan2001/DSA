import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int odd = 0;
        int even = 0;
        while (num != 0) {
            int rem = num%10;
            if (rem % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num/10;
            //System.out.println("even:"+even+"odd:"+odd);
        }
        System.out.println("even:"+even+" odd:"+odd);
    }
}
