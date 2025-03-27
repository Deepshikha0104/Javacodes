package numberss;
import java.util.Scanner;

/**
 * Armstrongnumber
 */
public class Armstrongnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count =0,n1=n,n2=n;
        do{
            n/=10;
            count++;
        } while (n>0) ;

        int sum =0;
        do {
            int rem = n1%10;
            int pd =1;
            for(int i=1;i<=count;i++){
                pd*=rem;
            }
            sum+=pd;
            n1/=10;
        } while (n1>0);
        if(n2==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
    }   
}