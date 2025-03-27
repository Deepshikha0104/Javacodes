package ha;

import java.util.Scanner;

public class Perfectnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = sumOfDivisior(n);
        if(sum==n) {
        	System.out.println("perfect Number");
        }
        else {
        	System.out.println("Not a Perfect number");
        }
	}
	public static int sumOfDivisior(int n) {
		int sum=1;
		for(int i=2;i<=n;i++) {
			if(n%2==0) {
				sum+=i;
			}}
			return sum;
		}
	}
