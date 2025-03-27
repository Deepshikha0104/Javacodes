package ha;

import java.util.Scanner;

public class array11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int len = scan.nextInt();
	    int arr[] = new int[len];
	    for(int i=0;i<=arr.length-1;i++) {
	    	System.out.println("Store");
	    	arr[i] = scan.nextInt();
	    } 
	         System.out.println("Array Contents are here");
	    	for(int i=0;i<arr.length-1;i++) {
	    		System.out.print(arr[i]+" ");
	    	}
	    	System.out.println("_____");
	    	System.out.println("Enter 2nd array Length");
	    	int len2=scan.nextInt();
	    	float arr2[] = new float[len2];
	    	 for(int i=0;i<=arr2.length-1;i++) {
	 	    	System.out.println("Store");
	 	    	arr2[i] = scan.nextFloat();
	 	    } 
	 	         System.out.println("Array Contents are here");
	 	    	for(int i=0;i<arr2.length-1;i++) {
	 	    		System.out.print(arr2[i]+" ");
	 	    	}
	}

}
