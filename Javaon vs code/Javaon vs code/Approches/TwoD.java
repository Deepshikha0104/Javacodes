package Approches;

import java.util.Scanner;
// average of each row
public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number pf classrooms");
        int classes = sc.nextInt();
        System.out.println("Student in each class: ");
        int students = sc.nextInt();

        int[][] marks = new int[classes][students];

        for(int i=0;i<marks.length; i++) {
            for(int j=0;j<marks[i].length;j++) {
                System.out.println("Please enter marks for class: " + i + " student: " + j);
                marks[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<marks.length; i++) {
            for(int j=0;j<marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<marks.length;i++) {
            double sum = 0.0, avg = 0.0;
            for(int j=0;j<marks[i].length;j++) {
                sum+= marks[i][j];
            }
            avg = sum/marks[i].length;
            System.out.println("Avg of row: " + i + " = " + avg);

        }
    }
}
