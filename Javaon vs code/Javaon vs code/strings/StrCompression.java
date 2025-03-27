package strings;
public class StrCompression {
    public static void main(String[] args) {
        String str = "aaaabbcccddyyyy";
        String result = "";
        int count =1;
        for(int i=0;i<str.length();i++){
            if(i+1 < str.length() && str.charAt(i) == str.charAt( i+1)){
            count++;
        }
            else{
            result += str.charAt(i);
            if(count > 1){
                result += count;
            }
            count =1;
        }
        System.out.println(result.length() < str.length() ? result : str);
    }
}
}
