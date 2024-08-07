import java.util.HashSet;

public class DuplicatesInArray {
    public static void main(String args[])
    {
        String arr[] = {"java","c","c++","python","java"} ;

//        boolean flag = false;
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j = i+1;j<arr.length;j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    System.out.println("Found duplicate:"+arr[i]);
//                    flag = true;
//                }
//            }
//        }
//        if(flag == false)
//        {
//            System.out.println("Duplicate value not found");
//        }
        //hashset approach

        HashSet<String> langs = new HashSet();
//        System.out.println(langs.add("java"));
//        System.out.println(langs.add("python"));
//        System.out.println(langs.add("java"));
        for(String l:arr)
        {
           if(langs.add(l) == false)
           {
               System.out.println("Found duplicate element:"+l);
           }
        }
    }
}
