public class ReverseWord {
    public static void reverse(String str)
    {
        String[] words = str.split(" ");
        for(int i = words.length-1;i>=0;i--)
        {
            System.out.println(words[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        String str = "Hello, World!";
        reverse(str);
    }
}
