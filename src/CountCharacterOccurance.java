public class CountCharacterOccurance {
    public static void main(String args[])
    {
        String str = "Java Programming Java oops";
        int total = str.length();
        int totalwithouta = str.replace("a","").length();
        int count = total - totalwithouta;
        System.out.println("Number of occurances of a is: "+count);
    }
}
