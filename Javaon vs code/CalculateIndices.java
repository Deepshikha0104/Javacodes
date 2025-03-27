import java.util.Arrays;
import java.util.Scanner;

public class CalculateIndices {
    public static void main(String[] args) {
        // String[] names = new String[5];
        // names[0] = "raj";
        // names[1] = "shikha";
        // names[2] = "Cat";
        // names[3] = "Zet";4
        // names[4] = "Fet";
        // for(int i=0;i<=4;i++) {
        //     System.out.println(names[i]);
        // }

        // String[] names = {"riya","rat","Cat","zar","fan"};
        // for(int i=0;i<names.length;i++) {
        //     System.out.println(names[i]);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println(":Enter sixe of the array: " );
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("eneter elements of the arraym  of the array: ");
        for(int i=0;i<marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.print("Array elemenets: ");
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
    }

}
