package Cintrlcunstruscc;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();  //accept the input
        int square = n * n;  //calculate square
        System.out.println(square);  //result
    }
}
