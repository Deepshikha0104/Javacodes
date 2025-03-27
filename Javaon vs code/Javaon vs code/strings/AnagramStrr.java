// Find the first non repeated charater in string

package strings;
public class AnagramStrr {
    public static void main(String[] args) {
        String str1 = "swiss";
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            boolean isRepeated = false;
            for (int j = 0;j<str1.length();j++) {
                if(i!=j && ch==str1.charAt(j)){
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated){
                System.out.println("Non re char in strinf " + ch);
                return;
            }
        }
        System.out.println("No non repeated char is stri ns");
    }
}
