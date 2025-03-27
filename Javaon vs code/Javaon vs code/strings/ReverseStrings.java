package strings;

public class ReverseStrings {
    public static void main(String[] args) {
        String s = "qweewq";
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        String temp = s;
        if(temp == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }    
}
