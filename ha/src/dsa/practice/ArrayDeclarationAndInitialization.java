package dsa.practice;
import java.util.Scanner;

public class ArrayDeclarationAndInitialization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int n = sc.nextInt();
		int []ar = ArrayMethod.input(n);
		ArrayMethod.print(ar);
	}
	System.out.println(ArrayMethod.min(ar));
	System.out.println(ArrayMethod.min(ar));
	System.out.println(ArrayMethod.sum(ar));
}
