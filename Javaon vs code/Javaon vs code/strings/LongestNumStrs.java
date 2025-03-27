package strings;
// print longest word in string

public class LongestNumStrs {
    public static void main(String[] args) {
        String str = "Java is a Programming Language";
        String word = "";
        String longest = "";
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            if (currChar!= ' ') {
                word = word+currChar;
            }
            else{
                if (word.length()>longest.length()) {
                    longest = word;
                }
                word = "";
            }
        }
        System.out.println(longest + " "+ longest.length());        
    }
}
