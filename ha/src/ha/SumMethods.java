package ha;

import java.util.Scanner;

// Parametrized method With Return types
/* 
  public class SumMethods {
	public static void Sum(int a,int b) {
		System.out.println("Sum of :" +" "+a+" "+b+" "+(a+b));
	}
	public static void main(String[] args) {
		System.out.println("Main Started");
		Sum(10,20);
	}
}
*/

//Parametrized method With Return types
/*
public class SumMethods {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = sc.nextInt();
		int Sum = SumofDivision(n);
		if(Sum==n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
	}
	public static int SumofDivision(int n) {
		int sum = 1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;2
}
}
*/
//METHOD OVERLODING
/*
public class SumMethods {
	public static void main(String [] args) {
		System.out.println("Main Started");
		Area(9);
		Area(7);
		Area(3,4);
		Area(5,9);
	}
	public static void Area(int side) {
		System.out.println(side*side);
	}
	public static void Area(double radius) {
		System.out.println(3.14*radius*radius);
	}
	public static void Area(double l,int b) {
		System.out.println(l*b);
	}
	public static void Area(int b,int h) {
		System.out.println(0.5*b*h);
	}
}
*/


