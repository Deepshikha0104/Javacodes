package numberss;
import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int count = 0;
        int n1 = 0;
        int n2 = 1;
        do{
            System.out.print(n1 +" , ");
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            count++;
        }while(count<n);
    }
}
