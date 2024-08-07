public class ReverseAstring {
    public static void main(String args[])
    {
        //1) using (String concatenation) operation
        String str = "ABCD";
        String rev = "";
//        int len = str.length();
//        for(int i = len-1;i>=0;i--) //3 2
//        {
//            rev = rev+str.charAt(i); //D C B A
//        }
//        System.out.println("Reverse of the string:"+rev);

        //2.Using character array
//        char a[] = str.toCharArray();
//        int len = a.length;
//        for(int i = len-1;i>=0;i--)
//        {
//            rev = rev+a[i];
//        }
//        System.out.println("Reverse of the string:"+rev);

        //Logic 3 ,using stringBuffer class
        StringBuffer rb = new StringBuffer(str);
        System.out.println("Reverse of the string: "+rb.reverse());





    }

}
