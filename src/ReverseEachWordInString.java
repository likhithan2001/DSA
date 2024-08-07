public class ReverseEachWordInString {
    public static void main(String args[])
    {
        // String str = "Welcome To Java";
//        String[] words = str.split(" "); //splitting string into words
//        String reverseString = "";
//        for(String w:words)
//        {
//            String reverseword = "";
//            for(int i = w.length()-1;i>=0;i--)
//            {
//               reverseword = reverseword+w.charAt(i);
//
//            }
//            reverseString = reverseString+reverseword+" ";
//        }
//        System.out.println("Reverse String:"+reverseString);
        String str = "Welcome To Java";
        String[] words = str.split("\\s");
        String reverseword = "";
        for(String w:words)
        {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseword = reverseword + sb.toString()+" ";
        }
        System.out.println(reverseword);


    }
}
