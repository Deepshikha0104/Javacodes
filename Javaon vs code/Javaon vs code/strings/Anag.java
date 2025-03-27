package strings;
import java.util.*;
import java.lang.reflect.Array;
public class Anag {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        if (str1.length()==str2.length()) {
            char[]s1 = str1.toCharArray();
            char[]s2 = str2.toCharArray();
            Array.sort(s1);
            Array.sort(s2);
            boolean isAnagram = true;
            for(int i=0;i<s1.length;i++){
                if (s1[i]!=s2[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) {
                System.out.println("Strings are anagram");
            }
            else{
                System.out.println("Strings are not Anagram: ");
            }
        }
    }
}
