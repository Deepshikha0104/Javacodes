package dsa.practice;
import java.util.Scanner;

//declare the array and display it

//public class MaximumElement {
//	public static void main(String[] args) {
//		int[] arr1 = arr1[5];
//		for(int i =0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
//	}
//}

//public class MaximumElement {
//	public static int findIndex(int[] arr1,int n) {
//		if(arr1==null)
//			return -1;
//		int len = arr1.length;
//		int i=0;
//		while(i<len) {
//			if(arr1[i]==n)
//				return i;
//			else
//				i = i+1;
//		}
//		return -1;
//	}
//	public static void main(String[] args) {
//		int n;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		int[] arr1 = new int[10];
//	}
//}

public class MaximumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] arr =new int[n];
		System.out.println("Enter "+n+"elements:");
		int sum =0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("sum of array elements" + sum);
	}
}



