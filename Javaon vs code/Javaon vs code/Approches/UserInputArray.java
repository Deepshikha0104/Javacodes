package Approches;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  of elements: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i< size;i++) {
            System.out.print("Eneter element: " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("You enterred the folowing elements: " );
        for(int i=0;i<size;i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }
        
    }
}
