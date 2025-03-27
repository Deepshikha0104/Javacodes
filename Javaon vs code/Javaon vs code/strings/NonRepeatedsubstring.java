package strings;
import java.util.HashSet;

/* 
public class NonRepeatedsubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String longest = "";
        int max = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                boolean hasDuplicate = false;
                for(int k = i;k<=j;k++){
                    for(int l = k+1;l<=j;l++){
                        if (str.charAt(k)==str.charAt(l)) {
                            hasDuplicate = true;
                            break;
                        }
                    }
                    if (hasDuplicate) {
                        break;
                    }
                }
                if (!hasDuplicate && (j-i+1)>max) {
                    max = j-i+1;
                    longest = "";
                    for(int k=i;k<=j;k++){
                        longest += str.charAt(k);
                    }
                }
            }
    }
    System.out.println(longest);
    System.out.println(max);
}
}
*/


// By Collection Framework

public class NonRepeatedsubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        String longest = "";
        int maxlength = 0;
        int i=0,j=0;
        while (j<s.length()) {
            if (!set.contains(s.charAt(j))) {
                j++;
                if(j-i>maxlength){
                    maxlength = j-i;
                    longest = s.substring(i, j);
                }
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
            System.out.println(longest);
        }
    }
}

