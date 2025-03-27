package numberss;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;
        int sum=0,rem = 0;
        do {
            rem = square % 10;
            sum = rem+sum;
            square/=10;
        } while (square!=0);
        if(sum==n){
            System.out.println("Neon Number ");
        }
        else{
            System.out.println("Not an neon number");
        }
    }
}
