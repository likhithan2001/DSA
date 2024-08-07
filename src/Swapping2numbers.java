public class Swapping2numbers {

    public static void main(String[] args)
    {
        int a=20,b=30;
        //LOGIC 1 using 3rd variable
        System.out.println("Before swapping values are .. "+a+" "+b);
//        int t = a;
//        a = b;
//        b = t;

        //Logic 2 use + & without using third variable
//        a = a+b; //a = 50;
//        b = a-b; // b = 20
//        a = a-b; // 50-20 = 30

        //logic 3 use * and
        //a and b values should not be zero
//        a = a*b; //a = 20*30 = 60
//        b = a/b; // b = 60/30 = 20
//        a = a/b; // a = 60/20 = 30

        //logic 4
        //bitwise XOR (^)
//        a = a^b;   // a = 20 = 10100 , 30 = 101000 , 111110 = 50
//        b = a^b;   //50 ^ 30 = 20
//        a = a^b;   //50 ^ 20 = 30

        //logic 5 - Single statement
        b = (a+b) - (a=b);  // (20+30) - (20 = 30)        right to left
        // (a = b) a is now 30     then (a+b) = 50 , 50 - 30 = 20 ,


        System.out.println("After swapping values are.. "+a+" "+b);

    }
}
