package numberss;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int fact =0;
        int n = sc.nextInt();
        for(int i =1;i<n;i++){
            fact = n*i;
        }
        System.out.println("Factorial number is" + (fact));
    }
}
