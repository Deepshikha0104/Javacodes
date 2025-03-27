package Approches;
import java.util.Scanner;

public class OneDar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("Enter element " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
    }
}
