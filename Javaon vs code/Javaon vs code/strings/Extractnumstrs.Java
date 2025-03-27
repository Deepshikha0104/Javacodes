package strings;
class Extractnumstrs{
    public static void main(String[] args){
        String str = "java is programming language ";
        int temp = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(charater.isDigit(ch)){
                temp = temp*10+ch-48;
            }
            if(i==s.length()-1 || charater.isDigit(s.charAt(i*1)0==false){
                System.out.println(temp);
            }
            else{
                temp=0;
            }
        }
    }
}