package numberss;
public class PerfectNum {
    public static void main(String[] args) {
        int n=6;
        int sum =0;
        int i=1;
        while(i<n){
            if(n%i==0){
                sum = sum+i;
            }
            i++;
        }
        if(n==sum){
            System.out.println("This number is perfect number");
        }
        else{
            System.out.println("not perfect");
        }
    }
}
