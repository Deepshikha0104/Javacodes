package strings;

public class Frequency {
    public static void main(String[] args) {
        String str = "java is a programming language";
        char target = 'a';
        int freq = 0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) ==target) {
                freq++;
            }
        }
        System.out.println(target +" , "+ freq);
    }
}
