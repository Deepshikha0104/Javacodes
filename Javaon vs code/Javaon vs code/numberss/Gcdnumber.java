package numberss;

public class Gcdnumber {
    public  void main(String[] args) {
      int n = 10;
      int m = 20;
      int temp = 1;
      if(n!=m){
        while(temp!=0){
            temp = n%m;
            if(temp!=0){
                n=m;
                m=temp;
            }
        }
        System.out.println(m);
      }
      else{
        System.out.println("no");
      }
    }
}
