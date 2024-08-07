


public class Anagram {
    public boolean isAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        int map[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }
        for(int i = 0;i<26;i++)
        {
            if(map[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram anagramChecker = new Anagram();

        // Test cases
        String s1 = "listen";
        String t1 = "silent";

        String s2 = "hello";
        String t2 = "billion";

        // Check and print whether the pairs of strings are anagrams
        System.out.println(s1 + " and " + t1 + " are anagrams: " + anagramChecker.isAnagram(s1, t1));
        System.out.println(s2 + " and " + t2 + " are anagrams: " + anagramChecker.isAnagram(s2, t2));
    }
}
