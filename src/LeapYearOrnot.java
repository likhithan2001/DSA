public class LeapYearOrnot {
    public static void main(String args[])
    {
        int year = 2024;
        if(year % 400 == 0)
        {
            System.out.println("Year is a leap year");
        }
        else if(year%4==0 && year%100 != 0)
        {
            System.out.println("Year is a Leap Year");
        }
        else
        {
            System.out.println("Year is not a leap year");
        }
    }
}
