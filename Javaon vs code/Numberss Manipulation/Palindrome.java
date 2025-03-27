package Numberss Manipulation;

import java.util.Scanner;
public class Palindrome {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int rev = 0;
        while (number != 0) {
            int rem = number%10;
            number = number/10;
            rev = rev*10 + rem;
        }
        if(rev == temp) {
            System.out.println(temp + " Palindrome number.");
        }
        else {
            System.out.println(temp+ " not Palindrome number");
        }
    }
}
